 Feature: Product search
 	
 	Scenario: Customer place an order
 		Given User is on home page
 		When he search for "shirt"
 		And Add to cart
 		Then Search should be displayed
 		Then Cart has the item 
 	