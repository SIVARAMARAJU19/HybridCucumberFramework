Feature: search funtionalty


Scenario: user should be search a valid product
Given user navigate to application url
When user search for valid product "jackets" in search box field
And user click on search button
Then user should be get a proper valid message

Scenario: user should be search a Invalid product
Given user navigate to application url
When user search for Invalid product "yamahaRx100" in search box field
And user click on search button
Then user should be get a proper invalid message
