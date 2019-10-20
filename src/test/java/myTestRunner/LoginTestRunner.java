package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features= "Features", // Location of Feature File and you can mention folder name Directly here
		//features= "D:/Software/Mywork/CucumberTest/Features/Tagging.feature",
		features= "D:/Software/Mywork/CucumberTest/Features/Hooks.feature",
		glue= "stepDefinations", //location of Test Defintion file and you can mention folder name also
		dryRun=false, // True Means it will check mapping between Step definition and Feature file but will not Test
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
		monochrome=true,
		strict= false
		//tags= {"@RegressionTest"} // Will execute only Regression Test
		//tags = {"@RegressionTest,@SanityTest"} // Here provide coma(,) between 2 Test and it will execute Test Scenarios which are coming under Regression Test OR Sanity Test 
		//tags = {"@RegressionTest","@SanityTest"} // Here Test Scenario will be executed which are part of Regression Testing as well as Sanity Test
		//tags= {"~@SanityTest"}// This will execute all Test Scenarios except Sanity Test
		//tags= {"~@SanityTest","~@RegressionTest"} // This will ignore both Scenarios
		)
public class LoginTestRunner {

}
