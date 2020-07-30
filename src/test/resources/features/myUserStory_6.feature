  ##"1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
  ##2. User should be able to add users and recipients from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
  ##3. User should be able to attach link by clicking on the link icon.
  ##4. User should be able to insert videos by clicking on the video icon and entering the video URL.
  ##5. User should be able to create a quote by clicking on the Comma icon.
  ##6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
  ##7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
  ##8. User should be able to click on the Topic icon to see the Appreciation Topic text box displays on top of the message box.
  ##9. User should be able to click on ""Record Video"" tab to record a video and attach it with the message.
  ##10. User should be able to add tags by selecting existing tags or creating new tags by clicking on the # icon.
  ##11. User should be able to see all types of appreciation illustration/emojis by clicking on the existing illustration/emojis."

Feature: sending appreciation

  Agile story: #6 As a user, I should be able to send appreciation by clicking on Appreciation subheading from ""More"" tab under Activity Stream

  Scenario Outline: login functionality scenario
    Given user is on login page
    When user puts correct name "<userNames>"
    And user puts correct pass "<passwords>"
    Then user should see next page

    Examples: all credentials so far
      | userNames                      | passwords |
      | helpdesk15@cybertekschool.com  | UserUser  |
      | helpdesk16@cybertekschool.com  | UserUser  |
      | marketing15@cybertekschool.com | UserUser  |
      | marketing16@cybertekschool.com | UserUser  |
      | hr15@cybertekschool.com        | UserUser  |
      | hr16@cybertekschool.com        | UserUser  |

  @login
  Scenario: login functionality scenario
    Given user is on login page
    When user puts correct name "helpdesk15@cybertekschool.com"
    And user puts correct pass "UserUser"
    Then user should see next page

    Scenario: uploading files on Appreciation subheading
      Given User is on the main page
      When user clicks on Appreciation subheading from ""More"" tab under Activity Stream


