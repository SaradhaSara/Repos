Feature: Book Train Ticket in MakeMyTrip 

Background: Launch MakeMyTrip Application
Given Launching Makemytrip 
When user clicks ad1
When user click HolidayPack

Scenario: Book Train Ticket 
When   User enter the from cities
|Bangalore|Chennai|Cochin|
And   User enter the to city in
|1|Bangalore|
|2|Chennai|
|3|Cochin|


Scenario: Book Hotel 
When   User enter in-times
|Bangalore|Chennai|Cochin|
And   User enter out-times
|1|Bangalore|
|2|Chennai|
|3|Cochin|
