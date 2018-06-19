package Vertical_scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class jquerry_site_vertical_scrolling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Volumes/DISK/Eclipse Imp Files/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit .SECONDS);
		
		
		
		driver.get("http://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		
		Actions Vertical_slider = new Actions(driver);
		WebElement Slider = driver.findElement(By.xpath("//*[@id='slider']/descendant::*[1]"));
		Vertical_slider.dragAndDropBy(Slider, 500, 0).build().perform();
		
		
		 
		 
		
		
		
		
		
		
		
		

	}

}
