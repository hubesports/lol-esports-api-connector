
lol-esports-api-connector

Java-wrapper for the [League of Legends' WebAPI](http://www.lolesports.com/en_US/worlds). 

**Requirements**

- Google GSON (JSON -> Java; java -> JSON)

**Overview**

This project will deserialize LOL API responses into typed Java objects. Potentially saving you a lot of headache when dealing with JSON strings.

**Example**

Creating a request URL:

 LolApi lolApi = new LolApi();
 
log.log(Level.INFO, lolApi.getScheduleItems(6).toString());
log.log(Level.INFO, lolApi.getPlayerByTeamAndTournament("samsung-galaxy", "11c03b08-39b0-4149-a790-13a137737459").toString());
log.log(Level.INFO, lolApi.getLeagueInfo(6).toString());
log.log(Level.INFO, lolApi.getLeagueInfo("worlds").toString());
log.log(Level.INFO, lolApi.getHighlanderMatchDetails("91be3d78-874a-44e0-943f-073d4c9d7bf6", "adc2b46b-5df6-4bcc-b931-65e3c605499a").toString());
log.log(Level.INFO, lolApi.getStatsGame("TRLH3", "1001440036", "5debbe8da795a7cf").toString());
log.log(Level.INFO, lolApi.getTimeLineStatsGame("TRLH3", "1001440036", "5debbe8da795a7cf").toString());

**Documentation**

Lvl LOL Api is described here https://gist.github.com/levi/e7e5e808ac0119e154ce
