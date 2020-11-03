package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import objects.ContactObjects;

public class ContactMethod extends ContactObjects{
	
	WebDriver driver=new ChromeDriver();
	
	//constructor
	
	public ContactMethod(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	public void Contact()
	{
		driver.findElement(Contact).click();
	}
	
	public void Dropdown()
	{
		driver.findElement(Dropdown).click();
		Select selection=new Select(driver.findElement(Dropdown));
		selection.selectByIndex(1);
	}
  
	public void Email()
	{
		driver.findElement(Email).sendKeys("milevskinikola@gmail.com");
	}
	public void Reference()
	{
		driver.findElement(Reference).sendKeys("3");
	}
	
	public void Message() {
		driver.findElement(Message).sendKeys("Autoation Practice website");
	}
	
	public void Submit() {
		driver.findElement(Submit).click();
	}
}
