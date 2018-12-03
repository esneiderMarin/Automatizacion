$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/google_search.feature");
formatter.feature({
  "name": "Google search",
  "description": "\tAs a web user\n\tI want to use google home page\n\tto search for a word",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for a required word",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that Esneider want to search a word",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchStepDefinitions.thatEsneiderWantToSearchAWord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he find for the word hola mundo",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchStepDefinitions.heFindForTheWordHolaMundo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he should see the word Hola mundo in the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchStepDefinitions.heShouldSeeTheWordHolaMundoInTheScreen()"
});
formatter.result({
  "status": "passed"
});
});