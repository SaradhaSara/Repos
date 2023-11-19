
Feature: Enter valid details #to explain the flow of our testcase as a summary





Scenario Outline: Create new account
Given launch facebook application "https://www.facebook.com/"
When user clicks New account
When user clicks "<Firstname>"
And  clicks  "<Surname>"
And user click  "<Mobile number>"
And users clicks  "<password>"
And user clickss  Date of birth "<date>","<month>","<year>"
And user clicking  Gender




Examples:
|Firstname| Surname| Mobile number|password|date|month|year|
|Saradha  |sara|9566905177|yyyyy|2|july|1995|


