$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/Deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "thennarasu1808@gmail.com",
        "Rainie@1808"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "Thenna deal",
        "1000",
        "50",
        "10"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefnition.user_already_on_login_page()"
});
formatter.result({
  "duration": 60355342500,
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 20.000\n  (Session info: chrome\u003d83.0.4103.61)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-351ON9A6\u0027, ip: \u0027192.168.43.251\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\AADITY~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55344}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 511267e02c1a32330a9e5b69e0a33e03\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:83)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:57)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:437)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat stepDefinitions.DealStepDefnition.user_already_on_login_page(DealStepDefnition.java:31)\r\n\tat ✽.Given user is already on Login Page(featureFiles/Deals.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DealStepDefnition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefnition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefnition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefnition.user_is_on_hopme_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefnition.user_moves_to_new_contact_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefnition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefnition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});