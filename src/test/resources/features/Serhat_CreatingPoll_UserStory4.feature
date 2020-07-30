Feature: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  User should be able to create polls by using the specified section on the page.

  Background: User has already logged in and currently
    Given User is on the login page
    Then user logs in
    Then User clicks on the poll section

  @userstory4 @uploadfile @AC1 @part1
  Scenario: User should be able to create a basic poll
    Then Users enters a message title with "Just testing guys nothing to see here"
    And User fills out Question text field with "Just testing guys nothing to see here"
    And User fills out Answer1 text field with "Just testing guys nothing to see here"
    And User fills out Answer2 text field with "Just testing guys nothing to see here"
    Then Click Send button

  @userstory4 @uploadfile @AC1 @part2
  Scenario: User should be able to click on upload files icon to upload files and pictures from local disks
    Then User uploads the file at the path "C:\Users\Altur\OneDrive\Desktop\My Java Projects\Beatrix24\UploadFiles\upload_test.txt"
    Then Users enters a message title with "Upload Test" upload version
    And User fills out Question text field with "Upload Question" upload version
    And User fills out Answer1 text field with "Upload Answer 1" upload version
    And User fills out Answer2 text field with "Upload Answer 2" upload version
    Then Click Send button upload version