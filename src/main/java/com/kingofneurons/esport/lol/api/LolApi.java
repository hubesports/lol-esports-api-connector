/*
 * Copyright 2016 Korolev Vladimir
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kingofneurons.esport.lol.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kingofneurons.esport.lol.api.endpoints.dto.highlander_match_details.HighlanderMatchDetails;
import com.kingofneurons.esport.lol.api.endpoints.dto.highlander_tournaments.HighlanderTournament;
import com.kingofneurons.esport.lol.api.endpoints.dto.leagues.Leagues;
import com.kingofneurons.esport.lol.api.endpoints.dto.players.Players;
import com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items.Match;
import com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items.ScheduleItem;
import com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items.ScheduleItems;
import com.kingofneurons.esport.lol.api.endpoints.dto.stats_game.StatsGame;
import com.kingofneurons.esport.lol.api.endpoints.dto.time_line_stats_game.TimeLineStatsGame;
import com.kingofneurons.esport.lol.util.DownloadJson;

import java.lang.reflect.Type;
import java.util.logging.Logger;

/**
 * List Api Esport LOL - https://gist.github.com/brcooley/8429583561c47b248f80
 * Source http://www.lolesports.com/
 * @version 1.0.0 alpha
 **/
public class LolApi {

    private static Logger log = Logger.getLogger(LolApi.class.getName());

    private final String API_LOL_ESPORT_SCHEDULE_ITEMS = "http://api.lolesports.com/api/v1/scheduleItems/";
    private final String API_LOL_ESPORT_PLAYERS = "http://api.lolesports.com/api/v1/teams/";
    private final String API_LOL_ESPORT_LEAGUE = "http://api.lolesports.com/api/v1/leagues/";
    private final String API_LOL_ESPORT_HIGHLANDER_MATCH_DETAILS = "http://api.lolesports.com/api/v2/highlanderMatchDetails/";
    private final String API_LOL_ESPORT_STATS_GAME = "https://acs.leagueoflegends.com/v1/stats/game/";

    /**
     * Получаем основную информацию лиги по её id.
     */
    public Leagues getLeagueInfo(int idLeague) throws Exception {
        String apiUrl = API_LOL_ESPORT_LEAGUE
                + "?id=" + idLeague;
        Type type = new TypeToken<Leagues>(){}.getType();
        return new Gson().fromJson(DownloadJson.readUrl(apiUrl), type);
    }

    /**
     * Получаем основную информацию лиги по её имени.
     */
    public Leagues getLeagueInfo(String slugLeague) throws Exception {
        String apiUrl = API_LOL_ESPORT_LEAGUE
                + "?slug=" + slugLeague;
        Type type = new TypeToken<Leagues>(){}.getType();
        return new Gson().fromJson(DownloadJson.readUrl(apiUrl), type);
    }

    /**
     * Получаем полную статистику турнира с матчами и командами.
     */
    public ScheduleItems getScheduleItems(int idLeague) throws Exception {
        String apiUrl = API_LOL_ESPORT_SCHEDULE_ITEMS
                + "?leagueId=" + idLeague;
        Type type = new TypeToken<ScheduleItems>(){}.getType();
        ScheduleItems scheduleItem = new Gson().fromJson(DownloadJson.readUrl(apiUrl), type);

        //Костыль для добавления команды в scheduleItem.
        for(ScheduleItem item : scheduleItem.getScheduleItems()){
            try {
                for (HighlanderTournament tournament : scheduleItem.getHighlanderTournaments()) {
                    if (tournament.getId().equals(item.getTournament())) {
                        Match match = tournament.getBrackets().get(item.getBracket()).getMatches().get(item.getMatch());
                        item.setTeamIdOne(tournament.getRosters().get(match.getInput().get(0).getRoster()).getTeam());
                        item.setTeamIdTwo(tournament.getRosters().get(match.getInput().get(1).getRoster()).getTeam());
                    }
                }
            }catch (Exception ignore){
//                log.log(Level.INFO, "ScheduleItem not found team " + item.getTournament());
            }
        }
        return scheduleItem;
    }

    /**
     * Получаем список игроков турнира и команды.
     */
    public Players getPlayerByTeamAndTournament(String slugTeam, String hashIdLeague) throws Exception {
        String apiUrl = API_LOL_ESPORT_PLAYERS
                + "?slug=" + slugTeam
                + "&tournament=" + hashIdLeague;
        Type type = new TypeToken<Players>() {}.getType();
        return new Gson().fromJson(DownloadJson.readUrl(apiUrl), type);
    }

    /**
     * Получаем информацию матча (Видео и id подробной статистики).
     */
    public HighlanderMatchDetails getHighlanderMatchDetails(String hashIdTournament, String hashIdMatch) throws Exception {
        String apiUrl = API_LOL_ESPORT_HIGHLANDER_MATCH_DETAILS
                + "?tournamentId=" + hashIdTournament
                + "&matchId=" + hashIdMatch;
        Type type = new TypeToken<HighlanderMatchDetails>() {}.getType();
        HighlanderMatchDetails match = new Gson().fromJson(DownloadJson.readUrl(apiUrl), type);
        match.setIdMatch(hashIdMatch);
        match.setIdTournament(hashIdTournament);
        return match;
    }

    /**
     * Получаем подробные детали матча.
     */
    public StatsGame getStatsGame(String gameRealm, String gameId, String gameHash) throws Exception {
        String apiUrl = API_LOL_ESPORT_STATS_GAME
                + "/" + gameRealm + "/"
                + "/" + gameId + "/"
                + "?gameHash=" + gameHash;
        Type type = new TypeToken<StatsGame>() {}.getType();
        return new Gson().fromJson(DownloadJson.readUrl(apiUrl), type);
    }

    /**
     * Получаем повременные детали матча.
     */
    public TimeLineStatsGame getTimeLineStatsGame(String gameRealm, String gameId, String gameHash) throws Exception {
        String apiUrl = API_LOL_ESPORT_STATS_GAME
                + "/" + gameRealm + "/"
                + "/" + gameId + "/"
                + "timeline"
                + "?gameHash=" + gameHash;
        Type type = new TypeToken<TimeLineStatsGame>() {}.getType();
        return new Gson().fromJson(DownloadJson.readUrl(apiUrl), type);
    }
}
