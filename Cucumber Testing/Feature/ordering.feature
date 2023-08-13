@Smoke
Feature: Ordering Quantities

Scenario outline: Order with different quantities
	Given: User searches for HP Pen Drive
	When: Add the first result on the page with quantity <qty>
	Then: Cart should display <qty> pen drive