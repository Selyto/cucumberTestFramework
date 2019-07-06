$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionalTests/E2E.feature");
formatter.feature({
  "name": "Product search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer place an order",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePagesteps.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he search for \"shirt\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePagesteps.he_search_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "HomePagesteps.add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePagesteps.choose_first_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cart has the item",
  "keyword": "Then "
});
formatter.match({
  "location": "CartSteps.cart_has_the_item()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});