Feature: signup

  Background:
    Given i am at belk Homepage

  @test
  Scenario:Create a brand new user used java faker
    And i click on errow
    And i click on manu bar
    And i click on Create Account
   And i enter first Name
    And i  enter Last Name
    And i enter phone Number
    And i enter email
    And i enter password
    And i enter conform password
#    When i click on Create Account button
#    Then i should be able to login


  @test2
  Scenario:Create a brand new user Hardcode
    And i click on errow
    And i click on manu bar
    And i click on Create Account
    And i enter first Name
    And i  enter Last Name
    And i enter emailAddress
    And i enter password
    And i enter conform password
    When i click on Create Account button
    Then i should be able to login

#
#    @login
#    Scenario: login account
#      And i click on errow
#      And i click on manu bar
#      And i enter emailAddress
#     When i click on Sing In button
#     Then i should be able to login


