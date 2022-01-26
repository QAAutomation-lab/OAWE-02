$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/actitimeLogin.feature");
formatter.feature({
  "name": "Testing Actitime application login functionlity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test Actitime application with valid user\u003ctc\u003e",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens actitime application \u003curl\u003e in chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters valid username as \u003cusername\u003e and password as \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "Actitime home page should be opened with the title as \u003cexpectedTitle\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "tc",
        "url",
        "username",
        "password",
        "expectedTitle"
      ]
    },
    {
      "cells": [
        "valid user",
        "https://demo.actitime.com/login.do",
        "admin",
        "manager",
        "actiTIME - Enter Time-Track"
      ]
    },
    {
      "cells": [
        "invalid user",
        "https://demo.actitime.com/login.do",
        "admin",
        "admin",
        "actiTIME - Login"
      ]
    },
    {
      "cells": [
        "invalid user",
        "https://demo.actitime.com/login.do",
        "null",
        "null",
        "actiTIME - Login"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test Actitime application with valid uservalid user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens actitime application https://demo.actitime.com/login.do in chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ActitimeLoginWithParamStepDefinition.user_opens_actitime_application_in_chrome_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username as admin and password as manager",
  "keyword": "When "
});
formatter.match({
  "location": "ActitimeLoginWithParamStepDefinition.user_enters_valid_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLoginWithParamStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Actitime home page should be opened with the title as actiTIME - Enter Time-Track",
  "keyword": "Then "
});
formatter.match({
  "location": "ActitimeLoginWithParamStepDefinition.actitime_home_page_should_be_opened_with_the_title_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Actitime application with valid userinvalid user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens actitime application https://demo.actitime.com/login.do in chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ActitimeLoginWithParamStepDefinition.user_opens_actitime_application_in_chrome_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username as admin and password as admin",
  "keyword": "When "
});
formatter.match({
  "location": "ActitimeLoginWithParamStepDefinition.user_enters_valid_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLoginWithParamStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Actitime home page should be opened with the title as actiTIME - Login",
  "keyword": "Then "
});
formatter.match({
  "location": "ActitimeLoginWithParamStepDefinition.actitime_home_page_should_be_opened_with_the_title_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Actitime application with valid userinvalid user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens actitime application https://demo.actitime.com/login.do in chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ActitimeLoginWithParamStepDefinition.user_opens_actitime_application_in_chrome_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username as null and password as null",
  "keyword": "When "
});
formatter.match({
  "location": "ActitimeLoginWithParamStepDefinition.user_enters_valid_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "ActitimeLoginWithParamStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Actitime home page should be opened with the title as actiTIME - Login",
  "keyword": "Then "
});
formatter.match({
  "location": "ActitimeLoginWithParamStepDefinition.actitime_home_page_should_be_opened_with_the_title_as(String)"
});
formatter.result({
  "status": "passed"
});
});