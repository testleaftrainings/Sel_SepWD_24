Feature: Login functionality of Leaftaps application



Scenario: Login with Valid Credentials

When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click on the login button



Scenario: Login with Invalid credentials

When Enter the username as 'Demo'
And Enter the password as 'crmsfa'
And Click on the login button
