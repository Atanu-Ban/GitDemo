import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Chrome browser invoke
		
		WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver_win32");
		
		//Hit URL
		
		driver.get("https://uat-eon.eteam.ou.edu/");
		
		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click anything with the help of linktext
		
		driver.findElement(By.xpath("//*[@id=\"navbarToolbar\"]/div/abp-nav-items/ul/li[2]/abp-current-user/a")).click();
		
		
		

	}

}
