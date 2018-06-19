package Flipkart_hovering_drag_drop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class hovering_drag_drop {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoke browser
		
		System.setProperty("webdriver.gecko.driver", "/Volumes/DISK/Eclipse Imp Files/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new SafariDriver();
		
		//Url Invoke
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='_3Njdz7']/descendant::*[1]")).click();
		
		//Hovering and locate mouse to the element
		
		WebElement tv = driver.findElement(By.xpath("//*[@title='TVs & Appliances']/child::*[1]"));
		Actions tv_applnce = new Actions(driver);
		tv_applnce.moveToElement(tv).build().perform();
		Thread.sleep(2000);
		System.out.println("mouse pointer moved ");
		WebElement sub_elements = driver.findElement(By.xpath("(//*[@title='Air Conditioners'])[1]/child::*[1]"));

		tv_applnce.moveToElement(sub_elements).build().perform();
		System.out.println("cursor reached successfully");
		WebElement Refg_elements = driver.findElement(By.xpath("(//*[@title='Inverter AC'])[1]/child::*[1]"));
		Thread.sleep(2000);
		tv_applnce.moveToElement(Refg_elements).click().build().perform();
	    Thread.sleep(2000);
	    System.out.println("Yeah we've done it ");
	    
	    /////////////////////////////////////////////////////////////////////////////////////
		
	    //horizontal slider
	    
	    Actions price_slider = new Actions(driver);
	    WebElement sliderX = driver.findElement(By.xpath("(//*[@class='_3aQU3C'])[1]"));
	    price_slider.dragAndDropBy(sliderX, 50, 0).build().perform();
	    Thread.sleep(2000);
	    WebElement sliderY = driver.findElement(By.xpath("(//*[@class='_3aQU3C'])[2]"));
	    price_slider.dragAndDropBy(sliderY, -50, 0).build().perform();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		

	}

}
