$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Software/Mywork/CucumberTest/Features/Hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Hooks in Cucumber",
  "description": "",
  "id": "hooks-in-cucumber",
  "keyword": "Feature"
});
formatter.before({
  "duration": 279300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Add new customer",
  "description": "",
  "id": "hooks-in-cucumber;add-new-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is in Add customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user fills the customer deatils",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Customer is added",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinations.user_is_in_Add_customer_page()"
});
formatter.result({
  "duration": 194251800,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinations.user_fills_the_customer_deatils()"
});
formatter.result({
  "duration": 64100,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinations.customer_is_added()"
});
formatter.result({
  "duration": 91200,
  "status": "passed"
});
formatter.after({
  "duration": 77700,
  "status": "passed"
});
formatter.before({
  "duration": 137900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Edit customer",
  "description": "",
  "id": "hooks-in-cucumber;edit-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User is on Edit customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user edit contact deatils",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Contact details updated",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinations.user_is_on_Edit_customer_page()"
});
formatter.result({
  "duration": 112100,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinations.user_edit_contact_deatils()"
});
formatter.result({
  "duration": 70800,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinations.contact_details_updated()"
});
formatter.result({
  "duration": 65700,
  "status": "passed"
});
formatter.after({
  "duration": 69600,
  "status": "passed"
});
formatter.before({
  "duration": 111300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Delete existing customer",
  "description": "",
  "id": "hooks-in-cucumber;delete-existing-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "User is on delete customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user delete the customer deatils",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Customer is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinations.user_is_on_delete_customer_page()"
});
formatter.result({
  "duration": 77000,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinations.user_delete_the_customer_deatils()"
});
formatter.result({
  "duration": 138100,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinations.customer_is_deleted()"
});
formatter.result({
  "duration": 75900,
  "status": "passed"
});
formatter.after({
  "duration": 62100,
  "status": "passed"
});
});