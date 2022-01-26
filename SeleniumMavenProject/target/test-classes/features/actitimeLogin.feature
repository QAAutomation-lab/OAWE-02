Feature: Testing Actitime application login functionlity

  #Scenario: Test Actitime application with valid user
  #Given User opens actitime application in chrome browser
  #When user enters valid username and password
  #And clicks on login button
  #Then Actitime home page should be opened
  
  #Scenario: Test Actitime application with valid user
  #Given User opens actitime application "https://demo.actitime.com/login.do" in chrome browser
  #When user enters valid username as "admin" and password as "manager"
  #And clicks on login button
  #Then Actitime home page should be opened with the title as "actiTIME - Enter Time-Track"
  
  Scenario Outline: Test Actitime application with <tc>
    Given User opens actitime application <url> in chrome browser
    When user enters valid username as <username> and password as <password>
    And clicks on login button
    Then Actitime home page should be opened with the title as <expectedTitle>

    Examples: 
      | tc           | url                                | username | password | expectedTitle               |
      | valid user   | https://demo.actitime.com/login.do | admin    | manager  | actiTIME - Enter Time-Track |
      | invalid user | https://demo.actitime.com/login.do | admin    | admin    | actiTIME - Login            |
      | invalid user | https://demo.actitime.com/login.do | null     | null     | actiTIME - Login            |
