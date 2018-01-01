$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "This Feature deals with login functionality of the application",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9134188661,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct username and password",
  "description": "",
  "id": "login-feature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the following email:admin",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter the following for login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iNavigateToLoginPage()"
});
formatter.result({
  "duration": 4479663971,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 28
    }
  ],
  "location": "MyStepdefs.iEnterTheFollowingEmailAdmin(String)"
});
formatter.result({
  "duration": 5157203,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "duration": 420122803,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickLoginButton()"
});
formatter.result({
  "duration": 541642803,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeTheUserformPage()"
});
formatter.result({
  "duration": 60833357,
  "status": "passed"
});
formatter.after({
  "duration": 175800,
  "status": "passed"
});
});