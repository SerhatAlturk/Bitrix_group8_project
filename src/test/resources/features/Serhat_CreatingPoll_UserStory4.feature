Feature: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  User should be able to create polls by using the specified section on the page.

  Background: User has already logged in and currently
    Given User is on the login page
    Then user logs in


  @userstory4 @uploadfile @AC1
  Scenario: User should be able to upload files
    Then User clicks on the poll section
    Then Users enters a message title
    And User fills out Question text field
    * User fills out Answer 1 text field
    * User fills out Answer 2 text field
    Then Click Send button
