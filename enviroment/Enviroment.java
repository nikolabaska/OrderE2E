package enviroment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enviroment {

	WebDriver driver;
	
	public String Url = "http://automationpractice.com/index.php";
	  
	public WebDriver browsersetup()  {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\baska\\Desktop\\chromedriver.exe\\");
			driver = new ChromeDriver();
			driver.get(Url); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			return driver;
			}
}