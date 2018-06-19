package waytosms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class send_sms {

	public static void main(String[] args) throws InterruptedException {
		

		//Invoke browser
				System.setProperty("webdriver.chrome.driver", "H:\\SeleniumHq\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//System.setProperty("webdriver.gecko.driver", "H:\\SeleniumHq\\geckodriver.exe");
				//WebDriver driver = new FirefoxDriver();
				
				
				//Url Invoke
				
				driver.get("http://www.way2sms.com/content/index.html?");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("9871536682");
				driver.findElement(By.id("password")).sendKeys("MANVITHA1997");
				driver.findElement(By.xpath("//input[@id='loginBTN']")).click();
				
				driver.findElement(By.xpath("//*[@id='sendSMS']/child::*[1]")).click();
				Thread.sleep(2000);
				driver.switchTo().frame("frame");
				driver.findElement(By.id("mobile")).sendKeys("8745006030");
				Thread.sleep(5000);
				for(int i = 0 ; i<=10 ; i++) {
					driver.findElement(By.xpath("//*[@class='right']")).click();
				}
				driver.findElement(By.xpath("//*[@class='grerlist']/descendant::*[7]")).click();
				driver.findElement(By.xpath("//*[@class='button br2up']")).click();
				
				
				Thread.sleep(3000);
				driver.switchTo().defaultContent();
				
				driver.switchTo().frame("frame");
				String Message = driver.findElement(By.xpath("//*[@class='wrap MES']/descendant::*[6]")).getText();
				System.out.println( Message);
				
				driver.switchTo().defaultContent();
		
				
				driver.findElement(By.xpath("//*[@class='home']")).click();
		
		
		
		

	}

}
