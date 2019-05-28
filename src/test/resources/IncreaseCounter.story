Increase Counter story

Narrative:
In order to get to know JBehave
As a developer
I want to create a counter and increase its value by 1
					 
Scenario: When a user increases a counter, its value is increased by 1

Given a counter
And the counter has any integer value
When the user increases the counter
Then the value of the counter must be 1 greater than the previous value
