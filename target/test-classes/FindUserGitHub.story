Find user name on GitHub

Narrative:
In order to get to know JBehave
As a developer
I want to query GitHub for a user and get his name as a response

Scenario: When a prior known user is checked on GitHub, we should get its name

Given a GitHub user search API
When I search for username phgbecker
Then his name should be Pedro Becker
