# lol-esports-api-connector


lol-esports-api-connector

Java-wrapper for the [League of Legends' WebAPI](http://www.lolesports.com/en_US/worlds). 

**Requirements**

- Google GSON (JSON -> Java; java -> JSON)

**Overview**

This project will deserialize LOL API responses into typed Java objects. Potentially saving you a lot of headache when dealing with JSON strings.

**Example**

Creating a request URL:

 LolApi lolApi = new LolApi();
 
 lolApi.getPlayerByTeamAndTournament("samsung-galaxy", "11c03b08-39b0-4149-a790-13a137737459").toString());
 
**Documentation**

Lvl lol Api is described here https://gist.github.com/levi/e7e5e808ac0119e154ce
