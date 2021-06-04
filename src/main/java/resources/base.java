package resources;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initialize() throws IOException {

		prop = new Properties();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if (browserName.contains("headless"))
				
			{
				options.addArguments("headless");
				//cmd line for headlesss test - mvn test -Dbrowser-chrome
				//cmd line for head test - mvn test -Dbrowser-chromeless

			}

			driver = new ChromeDriver();

		}

		else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\fisan\\OneDrive\\Desktop\\Eclipse\\firefoxdriver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {

			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\fisan\\OneDrive\\Desktop\\Eclipse\\IE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;

	}

	
	
    }


