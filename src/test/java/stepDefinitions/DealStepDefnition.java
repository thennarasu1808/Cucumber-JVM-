package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepDefnition {

	 WebDriver driver;

		
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page() throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver","F:\\Thenna\\Softwares\\Chrome Driver 83.0\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.freecrm.com/index.html");
	 driver.manage().window().maximize();
	 Timeouts timeOut = driver.manage().timeouts();
	 timeOut.pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//a[span='Log In']")).click();
	 
	 }
	 
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Cogmento CRM", title);
	 }
	 
	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password(DataTable credentials){
		List<List<String>> data = credentials.raw();
	 driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
	 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	 }
	
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 WebElement loginBtn =
	 driver.findElement(By.cssSelector("div.ui.fluid.large.blue.submit.button"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);
	 }
	 
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("Cogmento CRM", title);
	 
	 }
	 
	 
	 @Then("^user moves to new deal page$")
	 public void user_moves_to_new_contact_page() {
		driver.findElement(By.xpath("i.money.icon	")).click();
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
			
		}
	 
	 @Then("^user enters deal details$")
	 public void user_enters_contacts_details(DataTable dealData){
		 	List<List<String>> dealValues = dealData.raw();
		 driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
		 driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	 }
	 
	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }
}
	
