Feature:Logging into the Web page.
Scenario: This is a login Scenario.
Given User is on login page
When User tries to open with the credentials "Admin" and "admin123"
And clicks the login button
Then user should be able to log in and see the home page

