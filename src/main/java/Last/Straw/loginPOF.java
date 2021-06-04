package Last.Straw;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPOF {
	
	WebDriver driver;
	
	private By click_sign_up = By.cssSelector("div[class='_12e27_1r3kc']");
	private By username_field = By.id("username");
	private By password_field = By.id("password");
	private By log_in_button  = By.xpath("//button[@class='_0a08a_3czMG _988cf_1aDdJ']");
	private By message = By.xpath("//div[@class='_9a1ab_k0UMi']");
			
	
	
	public loginPOF (WebDriver driver) {

		this.driver = driver;
	}
	
	
	public WebElement logIn () {
		
		return driver.findElement(click_sign_up);
}
	
	public WebElement enter_username()
	{
		return driver.findElement(username_field);
	}
	
	public WebElement enter_password()
	{
		return driver.findElement(password_field);
	}
	
	public WebElement Log_In_Button()
	{
		return driver.findElement(log_in_button);
	}
	
	public WebElement error_message()
	{
		return driver.findElement(message);
	}
}

	
	
	
