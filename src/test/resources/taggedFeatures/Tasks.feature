@PhaseTwo
Feature: Taks CRUD Management

@SmokeTest
Scenario: Create a new Task
Given User is logged in
When User creates a new task

Scenario: View a Task
Given User is logged in
When User view task details

@RegressionTest
Scenario: Delete a Task
Given User is logged in
When User delete a task