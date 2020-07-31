$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/experience/resources/featurefiles/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "\r\nAs a user I want to login to qa experience account",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 31024438300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should Login successfully with valid credentials",
  "description": "",
  "id": "login-feature;user-should-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter user name to the field \"test@qa-experience.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter password to the field \"Password1\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Login submit button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should Login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnLoginPage()"
});
formatter.result({
  "duration": 4012355000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@qa-experience.com",
      "offset": 32
    }
  ],
  "location": "MyStepdefs.iEnterUserNameToTheField(String)"
});
formatter.result({
  "duration": 2784094900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password1",
      "offset": 31
    }
  ],
  "location": "MyStepdefs.iEnterPasswordToTheField(String)"
});
formatter.result({
  "duration": 308766000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginSubmitButton()"
});
formatter.result({
  "duration": 404322800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 40300,
  "status": "passed"
});
formatter.after({
  "duration": 1009359200,
  "status": "passed"
});
});