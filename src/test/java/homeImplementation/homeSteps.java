package homeImplementation;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class homeSteps {

	WebDriver driver;

	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\fisan\\OneDrive\\Desktop\\Eclipse\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.konga.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Buy Phones, Fashion, Electronics in Nigeria | Konga Online Shopping");

	}

	@When("^User clicks on the header menu category option$")
	public void user_clicks_on_the_header_menu_category_option() throws Throwable {

		driver.findElement(By.xpath("//a[@class='ef511_2c5_i'] [3]")).click();
		//h1[contains(text(),'Phones and Tablets')]
		WebElement fr = driver.findElement(By.xpath("//h1[contains(text(),'Phones and Tablets')]"));
		System.out.println(fr.getText());
		Assert.assertEquals(fr.getText(), "Phones And Tablets");

	}

	@Then("^User is navigated to the category page$")
	public void user_is_navigated_to_the_category_page() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'Mobile Phones')]")).click();
		WebElement fr1 = driver.findElement(By.xpath("//h1[contains(text(),'Mobile Phones')]"));
		System.out.println(fr1.getText());
		Assert.assertEquals(fr1.getText(), "Mobile Phones");

	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {

		driver.close();

	}
}
