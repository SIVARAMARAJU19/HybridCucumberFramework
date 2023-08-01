Feature: create an account funtionality

Scenario: user has created an account by mandatory fields
Given user has navigate to create new customer account page
When user has entered below 2nd details
|firstname      |akhil                       |
|lastname       |minnie                      |
|email          |generateemailwithtimestamp()|
|password       |password@1995               |
|confirmpassword|password@1995               |   
And user has click create an account option
Then user should get a proper success messege 


Scenario: user has created an account by all fields
Given user has navigate to create new customer account page
When user has entered below 3rd details
|firstname      |miniie                      |
|lastname       |akhil                       |
|email          |generateemailwithtimestamp()|
|password       |password@1005               |
|confirmpassword|password@1005               |   
And user has click create an account option
Then user should get a proper success messege    

 
Scenario: user has created an account by duplecate account
Given user has navigate to create new customer account page
When user has entered below duplecate details
|firstname      |minnie                  |
|lastname       |akhil                   |
|email          |minnieakki1919@gmail.com|
|password       |password@19             |
|confirmpassword|password@19             |   
And user has click create an account option
Then user should get a proper existingemail warning messege 


Scenario: user has created an account by witout providing any details
Given user has navigate to create new customer account page
When user has not entered any details
And user has click create an account option
Then user should get a proper no details warning messege 



Scenario: user has create an account from customer login page
Given user has navigate to customer login page clicks on create an account option
When user has entered below 4th details
|firstname      |ch                           |
|lastname       |akhil                        |
|email          |generateemailwithtimestamp() |
|password       |password@5991                |
|confirmpassword|password@5991                |   
And user has click create an account option
Then user should get a proper success messege      
