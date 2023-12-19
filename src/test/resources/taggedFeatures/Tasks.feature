@PhaseTwo
Feature: Taks CRUD Management

Background: Valid Login
Given User is logged in

@SmokeTest
Scenario: Create a new Task
When User creates a new task

Scenario: View a Task
When User view task details

@RegressionTest
Scenario: Delete a Task
When User delete a task