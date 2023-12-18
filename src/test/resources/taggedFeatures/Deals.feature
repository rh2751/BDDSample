@PhaseOne
Feature: Deals CRUD Management

@SmokeTest
Scenario: Create a new Deal
Given User is logged in
When User creates a new deal

@RegressionTest
Scenario: View a Deal
Given User is logged in
When User view deal details

Scenario: Delete a Deal
Given User is logged in
When User delete a deal