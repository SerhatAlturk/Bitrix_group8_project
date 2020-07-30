Feature: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  User should be able to create polls by using the specified section on the page.

  Background: User has already logged in and currently
    Given User is on the login page
    Then user logs in


  @userstory4 @uploadfile @AC1 @part1
  Scenario: User should be able to upload files
    Then User clicks on the poll section
    Then Users enters a message title with "Finally I could type in this body...."
    And User fills out Question text field with "What is the definition of Insanity?"
    And User fills out Answer1 text field with "Doing the same thing over and over again, expecting different results"
    And User fills out Answer2 text field with "Realizing all your bugs were because of a basic synchronization issue -_-"
    Then Click Send button
