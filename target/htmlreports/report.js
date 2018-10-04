$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#StyoryType\u003dWEB"
    },
    {
      "line": 2,
      "value": "#Owner\u003dSuvidya Pawaskar"
    },
    {
      "line": 3,
      "value": "#CreationDate\u003d31-7-2018 Tuesday"
    }
  ],
  "line": 5,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "user access finsys application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user opens the \"ch64\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user wait for \"5\" the Login page loaded",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user maximize the Login page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user load Login components",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 16
    }
  ],
  "location": "Login_background_steps.OpenBrowser(String)"
});
formatter.result({
  "duration": 4828117200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:90/finsys",
      "offset": 20
    }
  ],
  "location": "Login_background_steps.EnterURL(String)"
});
formatter.result({
  "duration": 2609383493,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "Login_background_steps.WaitTillLoginPageFullyLoaded(int)"
});
formatter.result({
  "duration": 9366171,
  "status": "passed"
});
formatter.match({
  "location": "Login_background_steps.MaximizeLoginPage()"
});
formatter.result({
  "duration": 1145842098,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.LoadLoginPage()"
});
formatter.result({
  "duration": 40108731,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login Functionality for valid username and password",
  "description": "",
  "id": "login-feature;login-functionality-for-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user enters \"dummyfm\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters \"passw0rd\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user is on the application home page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user gets the message starting with \"Welcome\" on the top",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user successfully logout from Finsys application",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user closes the \"ch64\" browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.VerifyLoginpage()"
});
formatter.result({
  "duration": 133390705,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummyfm",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterUsername(String)"
});
formatter.result({
  "duration": 5148400813,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passw0rd",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterPassword(String)"
});
formatter.result({
  "duration": 5129558819,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.ClickonLoginbutton()"
});
formatter.result({
  "duration": 89259794,
  "status": "passed"
});
formatter.match({
  "location": "Home_steps.homepageload()"
});
formatter.result({
  "duration": 2717009,
  "status": "passed"
});
formatter.match({
  "location": "Home_steps.verifyhomepage()"
});
formatter.result({
  "duration": 5059237018,
  "status": "passed"
});
formatter.match({
  "location": "Home_steps.Logoutfinsys()"
});
formatter.result({
  "duration": 5106882378,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 17
    }
  ],
  "location": "Home_steps.Closebrowser(String)"
});
formatter.result({
  "duration": 10154709070,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "user access finsys application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user opens the \"ch64\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user wait for \"5\" the Login page loaded",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user maximize the Login page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user load Login components",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 16
    }
  ],
  "location": "Login_background_steps.OpenBrowser(String)"
});
formatter.result({
  "duration": 3966391097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:90/finsys",
      "offset": 20
    }
  ],
  "location": "Login_background_steps.EnterURL(String)"
});
formatter.result({
  "duration": 2980246647,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "Login_background_steps.WaitTillLoginPageFullyLoaded(int)"
});
formatter.result({
  "duration": 5678070,
  "status": "passed"
});
formatter.match({
  "location": "Login_background_steps.MaximizeLoginPage()"
});
formatter.result({
  "duration": 1132237428,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.LoadLoginPage()"
});
formatter.result({
  "duration": 1308157,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Login Functionality for valid username and password",
  "description": "",
  "id": "login-feature;login-functionality-for-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user enters \"dummycfo\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user enters \"passw0rd\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user is on the application home page",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user gets the message starting with \"Welcome\" on the top",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user successfully logout from Finsys application",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user closes the \"ch64\" browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.VerifyLoginpage()"
});
formatter.result({
  "duration": 144146101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummycfo",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterUsername(String)"
});
formatter.result({
  "duration": 5144273247,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passw0rd",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterPassword(String)"
});
formatter.result({
  "duration": 5128235728,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.ClickonLoginbutton()"
});
formatter.result({
  "duration": 90189073,
  "status": "passed"
});
formatter.match({
  "location": "Home_steps.homepageload()"
});
formatter.result({
  "duration": 429653,
  "status": "passed"
});
formatter.match({
  "location": "Home_steps.verifyhomepage()"
});
formatter.result({
  "duration": 5061215469,
  "status": "passed"
});
formatter.match({
  "location": "Home_steps.Logoutfinsys()"
});
formatter.result({
  "duration": 5108997361,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 17
    }
  ],
  "location": "Home_steps.Closebrowser(String)"
});
formatter.result({
  "duration": 10222983300,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "user access finsys application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user opens the \"ch64\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user wait for \"5\" the Login page loaded",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user maximize the Login page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user load Login components",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 16
    }
  ],
  "location": "Login_background_steps.OpenBrowser(String)"
});
formatter.result({
  "duration": 3835764334,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:90/finsys",
      "offset": 20
    }
  ],
  "location": "Login_background_steps.EnterURL(String)"
});
formatter.result({
  "duration": 2350627669,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "Login_background_steps.WaitTillLoginPageFullyLoaded(int)"
});
formatter.result({
  "duration": 3209382,
  "status": "passed"
});
formatter.match({
  "location": "Login_background_steps.MaximizeLoginPage()"
});
formatter.result({
  "duration": 1125723945,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.LoadLoginPage()"
});
formatter.result({
  "duration": 212480,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Login Functionality for valid username and password",
  "description": "",
  "id": "login-feature;login-functionality-for-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "user enters \"dummyrm\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user enters \"passw0rd\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user is on the application home page",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "user gets the message starting with \"Welcome\" on the top",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user successfully logout from Finsys application",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user closes the \"ch64\" browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.VerifyLoginpage()"
});
formatter.result({
  "duration": 140344507,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummyrm",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterUsername(String)"
});
formatter.result({
  "duration": 5189609490,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passw0rd",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterPassword(String)"
});
formatter.result({
  "duration": 5139455762,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.ClickonLoginbutton()"
});
formatter.result({
  "duration": 89433447,
  "status": "passed"
});
formatter.match({
  "location": "Home_steps.homepageload()"
});
formatter.result({
  "duration": 424532,
  "status": "passed"
});
formatter.match({
  "location": "Home_steps.verifyhomepage()"
});
formatter.result({
  "duration": 5056906996,
  "status": "passed"
});
formatter.match({
  "location": "Home_steps.Logoutfinsys()"
});
formatter.result({
  "duration": 5104810488,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 17
    }
  ],
  "location": "Home_steps.Closebrowser(String)"
});
formatter.result({
  "duration": 10097976580,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "user access finsys application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user opens the \"ch64\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user wait for \"5\" the Login page loaded",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user maximize the Login page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user load Login components",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 16
    }
  ],
  "location": "Login_background_steps.OpenBrowser(String)"
});
formatter.result({
  "duration": 3834335856,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:90/finsys",
      "offset": 20
    }
  ],
  "location": "Login_background_steps.EnterURL(String)"
});
formatter.result({
  "duration": 3018636768,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "Login_background_steps.WaitTillLoginPageFullyLoaded(int)"
});
formatter.result({
  "duration": 5451938,
  "status": "passed"
});
formatter.match({
  "location": "Login_background_steps.MaximizeLoginPage()"
});
formatter.result({
  "duration": 1134984303,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.LoadLoginPage()"
});
formatter.result({
  "duration": 372479,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Login Functionality for valid username and invalid password",
  "description": "",
  "id": "login-feature;login-functionality-for-valid-username-and-invalid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "user enters \"dummyfm\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "user enters \"Password\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "user is on the same login page",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "user gets the message \"Please Enter Valid Username or Password!!!\" on login page",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "user closes the \"ch64\" browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.VerifyLoginpage()"
});
formatter.result({
  "duration": 155359308,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummyfm",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterUsername(String)"
});
formatter.result({
  "duration": 5155396002,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterPassword(String)"
});
formatter.result({
  "duration": 5178246096,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.ClickonLoginbutton()"
});
formatter.result({
  "duration": 89205608,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.VerifyLoginpagetitle()"
});
formatter.result({
  "duration": 86827799,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.Verifyloginerrormg()"
});
formatter.result({
  "duration": 5064353170,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 17
    }
  ],
  "location": "Home_steps.Closebrowser(String)"
});
formatter.result({
  "duration": 10133326279,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "user access finsys application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user opens the \"ch64\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user wait for \"5\" the Login page loaded",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user maximize the Login page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user load Login components",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 16
    }
  ],
  "location": "Login_background_steps.OpenBrowser(String)"
});
formatter.result({
  "duration": 9980555553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:90/finsys",
      "offset": 20
    }
  ],
  "location": "Login_background_steps.EnterURL(String)"
});
formatter.result({
  "duration": 6826082857,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "Login_background_steps.WaitTillLoginPageFullyLoaded(int)"
});
formatter.result({
  "duration": 4216740,
  "status": "passed"
});
formatter.match({
  "location": "Login_background_steps.MaximizeLoginPage()"
});
formatter.result({
  "duration": 1158281116,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.LoadLoginPage()"
});
formatter.result({
  "duration": 228266,
  "status": "passed"
});
formatter.scenario({
  "line": 60,
  "name": "Login Functionality for invalid username and valid password",
  "description": "",
  "id": "login-feature;login-functionality-for-invalid-username-and-valid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 59,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 61,
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 62,
  "name": "user enters \"dummy\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "user enters \"passw0rd\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "user is on the same login page",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "user gets the message \"Please Enter Valid Username or Password!!!\" on login page",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "user closes the \"ch64\" browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.VerifyLoginpage()"
});
formatter.result({
  "duration": 166725262,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummy",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterUsername(String)"
});
formatter.result({
  "duration": 5141803278,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passw0rd",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterPassword(String)"
});
formatter.result({
  "duration": 5127060263,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.ClickonLoginbutton()"
});
formatter.result({
  "duration": 108521628,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.VerifyLoginpagetitle()"
});
formatter.result({
  "duration": 92176910,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.Verifyloginerrormg()"
});
formatter.result({
  "duration": 5082564553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 17
    }
  ],
  "location": "Home_steps.Closebrowser(String)"
});
formatter.result({
  "duration": 12428155856,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "user access finsys application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user opens the \"ch64\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user wait for \"5\" the Login page loaded",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user maximize the Login page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user load Login components",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 16
    }
  ],
  "location": "Login_background_steps.OpenBrowser(String)"
});
formatter.result({
  "duration": 3492144653,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:90/finsys",
      "offset": 20
    }
  ],
  "location": "Login_background_steps.EnterURL(String)"
});
formatter.result({
  "duration": 2716954936,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "Login_background_steps.WaitTillLoginPageFullyLoaded(int)"
});
formatter.result({
  "duration": 4965965,
  "status": "passed"
});
formatter.match({
  "location": "Login_background_steps.MaximizeLoginPage()"
});
formatter.result({
  "duration": 1152468647,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.LoadLoginPage()"
});
formatter.result({
  "duration": 237653,
  "status": "passed"
});
formatter.scenario({
  "line": 71,
  "name": "Login Functionality for blank username and  password",
  "description": "",
  "id": "login-feature;login-functionality-for-blank-username-and--password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 70,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 72,
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 73,
  "name": "user enters \" \" as username",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "user enters \" \" as password",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "user is on the same login page",
  "keyword": "Then "
});
formatter.step({
  "line": 77,
  "name": "user gets the message \"Please Enter Valid Username or Password!!!\" on login page",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "user closes the \"ch64\" browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.VerifyLoginpage()"
});
formatter.result({
  "duration": 149209772,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " ",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterUsername(String)"
});
formatter.result({
  "duration": 5105481207,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " ",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterPassword(String)"
});
formatter.result({
  "duration": 5115964815,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.ClickonLoginbutton()"
});
formatter.result({
  "duration": 95426398,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.VerifyLoginpagetitle()"
});
formatter.result({
  "duration": 85658307,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.Verifyloginerrormg()"
});
formatter.result({
  "duration": 5073957421,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 17
    }
  ],
  "location": "Home_steps.Closebrowser(String)"
});
formatter.result({
  "duration": 10114025192,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "user access finsys application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user opens the \"ch64\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user wait for \"5\" the Login page loaded",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user maximize the Login page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user load Login components",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 16
    }
  ],
  "location": "Login_background_steps.OpenBrowser(String)"
});
formatter.result({
  "duration": 3461424705,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:90/finsys",
      "offset": 20
    }
  ],
  "location": "Login_background_steps.EnterURL(String)"
});
formatter.result({
  "duration": 2652594939,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "Login_background_steps.WaitTillLoginPageFullyLoaded(int)"
});
formatter.result({
  "duration": 3784954,
  "status": "passed"
});
formatter.match({
  "location": "Login_background_steps.MaximizeLoginPage()"
});
formatter.result({
  "duration": 1168489099,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.LoadLoginPage()"
});
formatter.result({
  "duration": 213759,
  "status": "passed"
});
formatter.scenario({
  "line": 82,
  "name": "Login Functionality for blank username and valid password",
  "description": "",
  "id": "login-feature;login-functionality-for-blank-username-and-valid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 81,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 83,
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 84,
  "name": "user enters \" \" as username",
  "keyword": "When "
});
formatter.step({
  "line": 85,
  "name": "user enters \"passw0rd\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "user is on the same login page",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "user gets the message \"Please Enter Valid Username or Password!!!\" on login page",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "user closes the \"ch64\" browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.VerifyLoginpage()"
});
formatter.result({
  "duration": 173571970,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " ",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterUsername(String)"
});
formatter.result({
  "duration": 5111126424,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passw0rd",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterPassword(String)"
});
formatter.result({
  "duration": 5128856526,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.ClickonLoginbutton()"
});
formatter.result({
  "duration": 97617327,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.VerifyLoginpagetitle()"
});
formatter.result({
  "duration": 86795799,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.Verifyloginerrormg()"
});
formatter.result({
  "duration": 5067002765,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 17
    }
  ],
  "location": "Home_steps.Closebrowser(String)"
});
formatter.result({
  "duration": 10100699562,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "user access finsys application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user opens the \"ch64\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user wait for \"5\" the Login page loaded",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user maximize the Login page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user load Login components",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 16
    }
  ],
  "location": "Login_background_steps.OpenBrowser(String)"
});
formatter.result({
  "duration": 3397159002,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:90/finsys",
      "offset": 20
    }
  ],
  "location": "Login_background_steps.EnterURL(String)"
});
formatter.result({
  "duration": 2645191432,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "Login_background_steps.WaitTillLoginPageFullyLoaded(int)"
});
formatter.result({
  "duration": 4121167,
  "status": "passed"
});
formatter.match({
  "location": "Login_background_steps.MaximizeLoginPage()"
});
formatter.result({
  "duration": 1137481579,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.LoadLoginPage()"
});
formatter.result({
  "duration": 266666,
  "status": "passed"
});
formatter.scenario({
  "line": 93,
  "name": "Login Functionality for valid username and blank password",
  "description": "",
  "id": "login-feature;login-functionality-for-valid-username-and-blank-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 92,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 94,
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 95,
  "name": "user enters \"dummycfo\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 96,
  "name": "user enters \" \" as password",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "user is on the same login page",
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "user gets the message \"Please Enter Valid Username or Password!!!\" on login page",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "user closes the \"ch64\" browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.VerifyLoginpage()"
});
formatter.result({
  "duration": 167098595,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummycfo",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterUsername(String)"
});
formatter.result({
  "duration": 5157941491,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " ",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterPassword(String)"
});
formatter.result({
  "duration": 5108219975,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.ClickonLoginbutton()"
});
formatter.result({
  "duration": 100621055,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.VerifyLoginpagetitle()"
});
formatter.result({
  "duration": 89305448,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.Verifyloginerrormg()"
});
formatter.result({
  "duration": 5062351680,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 17
    }
  ],
  "location": "Home_steps.Closebrowser(String)"
});
formatter.result({
  "duration": 12443585376,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "user access finsys application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user opens the \"ch64\" browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user wait for \"5\" the Login page loaded",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user maximize the Login page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user load Login components",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 16
    }
  ],
  "location": "Login_background_steps.OpenBrowser(String)"
});
formatter.result({
  "duration": 3208529138,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://localhost:90/finsys",
      "offset": 20
    }
  ],
  "location": "Login_background_steps.EnterURL(String)"
});
formatter.result({
  "duration": 2435898989,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "Login_background_steps.WaitTillLoginPageFullyLoaded(int)"
});
formatter.result({
  "duration": 3467941,
  "status": "passed"
});
formatter.match({
  "location": "Login_background_steps.MaximizeLoginPage()"
});
formatter.result({
  "duration": 1146185990,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.LoadLoginPage()"
});
formatter.result({
  "duration": 364373,
  "status": "passed"
});
formatter.scenario({
  "line": 104,
  "name": "Login Functionality by passing special characters in username and invalid password",
  "description": "",
  "id": "login-feature;login-functionality-by-passing-special-characters-in-username-and-invalid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 103,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 105,
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 106,
  "name": "user enters \"@$#%$%\u0026\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 107,
  "name": "user enters \"password\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "user is on the same login page",
  "keyword": "Then "
});
formatter.step({
  "line": 110,
  "name": "user gets the message \"Please Enter Valid Username or Password!!!\" on login page",
  "keyword": "And "
});
formatter.step({
  "line": 111,
  "name": "user closes the \"ch64\" browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.VerifyLoginpage()"
});
formatter.result({
  "duration": 160081646,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "@$#%$%\u0026",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterUsername(String)"
});
formatter.result({
  "duration": 5184486511,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "Login_steps.EnterPassword(String)"
});
formatter.result({
  "duration": 5147139162,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.ClickonLoginbutton()"
});
formatter.result({
  "duration": 98004312,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.VerifyLoginpagetitle()"
});
formatter.result({
  "duration": 80929569,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.Verifyloginerrormg()"
});
formatter.result({
  "duration": 5083140978,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ch64",
      "offset": 17
    }
  ],
  "location": "Home_steps.Closebrowser(String)"
});
formatter.result({
  "duration": 10108277575,
  "status": "passed"
});
});