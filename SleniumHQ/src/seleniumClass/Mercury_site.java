package seleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury_site {
	

	public static void main(String[] args) throws InterruptedException {
	
//Invoke browser
		System.setProperty("webdriver.chrome.driver", "H:\\SeleniumHq\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Url Invoke
		
		driver.get("http://newtours.demoaut.com/");
		
		/*driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Abhishek");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Chaudhary");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("9874563210");
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("abhi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("A 20 vipin garden ");
		Thread.sleep(2000);
		driver.findElement(By.name("address2")).sendKeys("Dwarka Mor");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("New Delhi");
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("Delhi");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("110059");
		Thread.sleep(2000);
		//driver.findElement(By.name("country")).click();
		
		Select sc = new Select(driver.findElement(By.name("country")));
		sc.selectByVisibleText("ANDORRA");
		sc.selectByIndex(0);
		sc.selectByValue("92");
		
		driver.findElement(By.id("email")).sendKeys("AbhiChaudhary6030");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("8745@Abhi");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("8745@Abhi");
		Thread.sleep(2000);
		
		driver.findElement(By.name("register")).click();
		
		
		/////////////////////
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		driver.findElement(By.name("userName")).sendKeys("AbhiChaudhary6030");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("8745@Abhi");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Home")).click();
		
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Thank You ");*/
		
		Thread.sleep(5000);
		
		///////////////////////////////////////////////////After Sign in///////////////////////////////////////////////////////////////////////////////////
		
		
	
		driver.findElement(By.name("userName")).sendKeys("AbhiChaudhary6030", Keys.TAB ,"8745@Abhi" ,Keys.ENTER);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		Select sc1 = new Select(driver.findElement(By.name("passCount")));
		sc1.selectByValue("2");
		Thread.sleep(2000);
		
		Select sc2 = new Select(driver.findElement(By.name("fromPort")));
		sc2.selectByValue("New York");
		Thread.sleep(2000);
		
		Select sc3 = new Select(driver.findElement(By.name("fromMonth")));
		sc3.selectByValue("4");
		Thread.sleep(2000);
		
		Select sc4 = new Select(driver.findElement(By.name("fromDay")));
		sc4.selectByValue("25");
		Thread.sleep(2000);
		Select sc5 = new Select(driver.findElement(By.name("toPort")));
		sc5.selectByValue("London");
		Thread.sleep(2000);
		Select sc6 = new Select(driver.findElement(By.name("toMonth")));
		sc6.selectByValue("5");
		Thread.sleep(2000);
		Select sc7 = new Select(driver.findElement(By.name("toDay")));
		sc7.selectByValue("5");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='radio'])[5]")).click();
		Thread.sleep(2000);
		
		Select sc8 = new Select(driver.findElement(By.name("airline")));
		sc8.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.name("findFlights")).click();
		driver.close();
		
		
		
	}

}
