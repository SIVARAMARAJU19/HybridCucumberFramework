Feature: Signout Futionality

 Scenario: User has signout from click signout option
 Given User has navigate to  Account Homepage
 When User has click on Account dropdown
 And click signout option
 Then User should be sucessfully signedout
 
 Scenario: User has checks the signout option without clicking signout option
 Given User has navigate to  Account Homepage
 When User has close the browser
 And User has reopen site link
 Then User should be in a Account Homepage
 
 