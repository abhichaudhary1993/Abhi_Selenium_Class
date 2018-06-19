package Automationpracticesite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signup_signin {

	public static void main(String[] args) throws InterruptedException {
		//Invoke browser
		System.setProperty("webdriver.chrome.driver", "H:\\SeleniumHq\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Url Invoke
		
		driver.get("http://automationpractice.com/index.php");
		
		//Signup
		/*driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("doyourworkabhi@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		//driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Abhishek");
		driver.findElement(By.id("customer_lastname")).sendKeys("Chaudhary");
		driver.findElement(By.id("passwd")).sendKeys("8745@Abhi");
		
		
		Select DOB_day = new Select (driver.findElement(By.name("days")));
		DOB_day.selectByValue("5");
		
		Select DOB_month = new Select (driver.findElement(By.name("months")));
		DOB_month.selectByValue("1");
		
		
		Select DOB_year = new Select (driver.findElement(By.name("years")));
		DOB_year.selectByValue("1993");
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		
		driver.findElement(By.id("firstname")).sendKeys("Abhishek");
		driver.findElement(By.id("lastname")).sendKeys("Chaudhary");
		driver.findElement(By.id("company")).sendKeys("Student");
		driver.findElement(By.id("address1")).sendKeys("A 20 laxman puri vipin garden near dwarka mor");
		driver.findElement(By.id("address2")).sendKeys("metro station new delhi 110059");
		driver.findElement(By.id("city")).sendKeys("New delhi");
		
		Select State = new Select (driver.findElement(By.name("id_state")));
		State.selectByValue("9");
		
		driver.findElement(By.id("postcode")).sendKeys("11005");
		
		
		Select country = new Select (driver.findElement(By.id("id_country")));
		country.selectByValue("21");
		
		driver.findElement(By.id("other")).sendKeys("Hello I Am Abhishek");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("9874563210");
		
		
		driver.findElement(By.id("alias")).sendKeys("Dwarka mor");
		
		
		driver.findElement(By.id("submitAccount")).click();*/
		
		
		//login 
		/*driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("doyourworkabhi@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("8745@Abhi");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.get("http://automationpractice.com/index.php");*/
		
		
		//Add to cart Popular
		
		//driver.findElement(By.className("product_img_link")).click();
		
		/*driver.findElement(By.className("icon-plus")).click();
		driver.findElement(By.className("icon-plus")).click();
		driver.findElement(By.className("icon-minus")).click();
		driver.findElement(By.className("icon-minus")).click();
	    
		
		Select AtoCsize = new Select(driver.findElement(By.id("group_1")));
		AtoCsize.selectByValue("1");
		AtoCsize.selectByValue("2");
		AtoCsize.selectByValue("3");
		
		driver.findElement(By.name("Orange")).click();
		driver.findElement(By.name("Blue")).click();
		
		driver.findElement(By.name("Orange")).click();
		driver.findElement(By.className("icon-twitter")).click();
		driver.findElement(By.className("icon-facebook")).click();
		driver.findElement(By.className("icon-google-plus")).click();
		driver.findElement(By.className("icon-pinterest")).click();
		
		
		driver.findElement(By.id("send_friend_button")).click();*/
		//driver.findElement(By.id("print")).click();
		//driver.findElement(By.id("wishlist_button")).click();
		
		//driver.findElement(By.name("Submit")).click();
		//driver.findElement(By.id("Submit")).click();
		
		
		
	}

}
