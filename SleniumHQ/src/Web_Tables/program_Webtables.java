package Web_Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_Webtables {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "H:\\SeleniumHq\\chromedriver.exe");
			
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://money.rediff.com/gainers/bsc/daily/groupa?");
		  driver.manage().window().maximize();
		  
		  List<WebElement> l1 = driver.findElements(By.tagName("Table"));
		  int size_of_table = l1.size();
		  System.out.println(l1);
		  System.out.println(size_of_table);
		  
		  
		  
		  
		
		
		
		
		
	}

}
