package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactObjects {
	
	WebDriver driver;
	
	protected By Contact=By.xpath("//*[@id=\"contact-link\"]/a");
	protected By Dropdown=By.id("id_contact");
	protected By Email=By.id("email");
	protected By Reference=By.id("id_order");
	protected By Message=By.id("message");
	protected By Submit=By.xpath("//*[@id=\"submitMessage\"]");

}
