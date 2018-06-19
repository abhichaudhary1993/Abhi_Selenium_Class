package Drag_Drop_item;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class drag_drop_item {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Volumes/DISK/Eclipse Imp Files/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new SafariDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions dragger = new Actions(driver);
		Thread.sleep(2000);
		WebElement Drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		Thread.sleep(2000);
		WebElement Drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		dragger.dragAndDrop(Drag, Drop).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		System.out.println("yes we done it");
		driver.close();
		
		
	}

}
