Feature: Tags in Cucumber
@SanityTest
Scenario: Verify login
Given This is a valid login Test

@SanityTest @RegressionTest
Scenario: Verify logout
Given This is logout Test

@SanityTest @End2EndTest
Scenario: Verify search
Given This is search Test

@RegressionTest
Scenario: Verify advance search
Given This is advance search Test

@End2EndTest
Scenario: Verify Prepaid Recharge
Given This is a valid Prepaid recharge Test

@End2EndTest @RegressionTest
Scenario: Verify Postpaid Recharge
Given This is a valid Postpaid recharge Test