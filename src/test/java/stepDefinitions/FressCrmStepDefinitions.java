/*
 * package stepDefinitions;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When;
 * 
 * 
 * 
 * public class FressCrmStepDefinitions {
 * 
 * 
 * WebDriver driver; WebDriverWait wait;
 * 
 * @Given("^user is in login page$") public void user_is_in_login_page() throws
 * Throwable { System.setProperty("webdriver.chrome.driver",
 * "F:\\Thenna\\Softwares\\Chrome Driver 83.0\\chromedriver.exe"); WebDriver
 * driver = new ChromeDriver(); driver.get("https://ui.cogmento.com/");
 * driver.manage().window().maximize(); }
 * 
 * @When("^user enters username and password$") public void
 * user_enters_username_and_password() throws Throwable { Thread.sleep(5000);
 * WebElement userName
 * =driver.findElement(By.cssSelector("input[name='email']")); userName.click();
 * userName.sendKeys("thennarasu1808@gmail.com");
 * 
 * WebElement pWord =
 * driver.findElement(By.cssSelector("input[name='password']")); pWord.click();
 * pWord.sendKeys("Rainie@1808"); }
 * 
 * @When("^user clicks on login button$") public void
 * user_clicks_on_login_button() throws Throwable { driver.findElement(By.
 * cssSelector("div[class='ui fluid large blue submit button']")).click(); }
 * 
 * @Then("^user is in homepage$") public void user_is_in_homepage() throws
 * Throwable { String title = driver.getTitle(); Assert.assertEquals("COGMENTO",
 * title); }
 * 
 * 
 * }
 * 
 * 
 */