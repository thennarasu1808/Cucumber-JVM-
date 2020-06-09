package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleStepDefinition {
	
	public WebDriver driver;
	
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "F:\\Thenna\\Softwares\\Chrome Driver 83.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String arg1) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(arg1);
	}

	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^the user should see the search results$")
	public void the_user_should_see_the_search_results() throws Throwable {
		boolean status = driver.findElement(By.partialLinkText("selenium")).isDisplayed();
		if(status) {
			System.out.println("Results displayed!");
		}
	}

}
