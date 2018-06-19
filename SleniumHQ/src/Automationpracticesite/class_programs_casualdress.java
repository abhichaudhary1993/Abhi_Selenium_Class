package Automationpracticesite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_programs_casualdress {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//Invoke browser
				System.setProperty("webdriver.chrome.driver", "H:\\SeleniumHq\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				//Url Invoke
				
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[@title='Women'])[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[@class='grower CLOSE'])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Casual Dresses")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@title='Add to cart']")).click();
				
		
		
		
		
		
		
		
		

	}

}
