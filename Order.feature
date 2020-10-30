Feature: Order 32E

Scenario: Orver with valid credentials

Given User is login succesful with valid credentials
When User is add product into the cart
Then User proceed to check out
And User verify his shipping address
And User select Terms of service and Pay by check method
Then User succesful makes an order
