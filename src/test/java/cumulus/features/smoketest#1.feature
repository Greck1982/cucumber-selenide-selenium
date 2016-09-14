@smoketest
Feature: smoke test #1, open Cumulus page and Login

#  Scenario: test the login feature
#
#    #actions at Login page
#    Given open 10.21.53.12/login
#    And check that element with name "LoginName" is displayed
#    And type to input with name "LoginName" text: "ctest"
#    And press button "LoginButton"

  Scenario: test the login feature and make sure that user is logged in

    #actions at Login page
    Given open 10.21.53.12/login
    And check that element with name "LoginName" is displayed
    And type to input with name "LoginName" text: "grytsyna"
    And press button "LoginButton"
    Then Check that user "cte3st" is "logged in"
