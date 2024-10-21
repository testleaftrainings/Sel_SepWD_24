Feature: CreateLead functionality of Leaftaps application

Scenario Outline: CreateLead with multiple data


When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click on the login button
When Click on CRMSFA link
When Click on Leads link
When Click on CreateLead link
When Enter the companyname as <companyname>
When Enter the firstname as <firstname>
When Enter the lastname as <lastname>
When Click on the CreateLead button
Then Lead should be created

Examples:
|companyname|firstname|lastname|
|Testleaf|Vineeth|Rajendran|
|Qeagle|Hari|R|

