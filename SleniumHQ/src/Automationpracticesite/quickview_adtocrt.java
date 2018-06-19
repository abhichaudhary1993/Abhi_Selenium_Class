package Automationpracticesite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quickview_adtocrt {

	public static void main(String[] args) {
		
          System.setProperty("webdriver.chrome.driver", "H:\\SeleniumHq\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://automationpractice.com/index.php");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("(//a[@class='blockbestsellers'])[1]")).click();
		  driver.findElement(By.xpath("(//a[@class='product_img_link'])[2]")).click();
		  driver.findElement(By.xpath("")).click();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  

	}

}
