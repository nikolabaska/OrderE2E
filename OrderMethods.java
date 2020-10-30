package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import objects.OrderObjects;

public class OrderMethods extends OrderObjects{

	WebDriver driver;
	
	//constructor
	public OrderMethods(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Procced() {
		
		driver.findElement(Procced).click();
	}
     public void Procceed1() {
    	 
    	 driver.findElement(Procceed1).click();
     }
     
     public void Verify() {
    	 driver.findElement(Verify).click();
     }

     public void Terms() {
    	 driver.findElement(Terms).click();
     }
     
     public void Procced2() {
    	 driver.findElement(Procced2).click();
     }
     
     public void Payment() {
    	 driver.findElement(Payment).click();
     }
     public void Confirm() {
    	 driver.findElement(Confirm).click();
     }
}
