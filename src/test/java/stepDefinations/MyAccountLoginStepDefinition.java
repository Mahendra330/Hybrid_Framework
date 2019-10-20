package stepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyAccountLoginStepDefinition {

	WebDriver driver;
@Given("^Open the Browser$")
public void open_the_Browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
}

/*@When("^Enter URL$")
public void enter_URL() throws Throwable {
	driver.get("http://practice.automationtesting.in/");

}*/

@When("^Enter URL \"([^\"]*)\"$")
public void enter_URL(String url) throws Throwable {
 driver.get(url);
}

@When("^click on My Account$")
public void click_on_My_Account() throws Throwable {
	driver.findElement(By.xpath("//a[contains(.,'My Account')]")).click();
			
    
}

/*@When("^Provide valid username and password$")
public void provide_valid_username_and_password() throws Throwable {
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mahendra.barik330@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("2019@Matul");

}*/

//Scenario Outline and examples
/*@When("^Provide valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
public void provide_valid_username_and_password(String user, String pwd) throws Throwable {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);

}*/
// Login with Data Table Param with single Input
/*@When("^Provide valid username and password$")
public void provide_valid_username_and_password(DataTable credential) throws Throwable {
    List<List<String>> data = credential.raw();
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0));
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get(0).get(1));
}*/

//Login with Data Table Param with single Input with Header
@When("^Provide valid username and password$")
public void provide_valid_username_and_password(DataTable credential) throws Throwable {
 List<Map<String,String>>data = credential.asMaps(String.class, String.class);
 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get("username"));
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get(0).get("password"));
}

@When("^click on login$")
public void click_on_login() throws Throwable {
	driver.findElement(By.xpath("//input[@name='login']")).click();
    
}

@Then("^User must Login Successfully$")
public void user_must_Login_Successfully() throws Throwable {
	
	String captureText= driver.findElement(By.xpath("//strong[contains(.,'mahendra.barik330')]")).getText();
	Assert.assertEquals(captureText, "mahendra.barik330");
	
   driver.close();
}

@Then("^verify login$")
public void verify_login() throws Throwable {
	String captureText= driver.findElement(By.xpath("//strong[contains(.,'ERROR')]")).getText();
	if(captureText.contains("ERROR")) {
		Assert.assertTrue("Invalid Input-Error Page", true);
		driver.close();
	}
	else {
		Assert.assertTrue(false);
		driver.close();
	}
	 
}

}
