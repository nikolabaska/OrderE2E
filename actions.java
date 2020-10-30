package cucmberOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class actions {

	
	WebDriver driver;

    public actions(WebDriver driver) {

        this.driver=driver;
        
        
    
    
    }
   
    
    public void Woman1() 
    {
    	Actions a = new Actions(driver);
        WebElement Woman1 =driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
       a.moveToElement(Woman1).build().perform();
    }
       
    public void Blouses() 
    {
    	Actions a = new Actions(driver);
       WebElement Blouses =driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a"));
		a.moveToElement(Blouses).click().build().perform();
    }
		//WebElement Blouses1 =driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a"));
      // a.moveToElement(Blouses1).click().build().perform();
     
    public void Product()
     {
    	 Actions a = new Actions(driver);
    WebElement Product =driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div[1]"));
        a.moveToElement(Product).click().build().perform();
     }
    public void Addtocart()
    {
    	driver.switchTo().frame(0);
    	
    }
    
    }
    
    
    

