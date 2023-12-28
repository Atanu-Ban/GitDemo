import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class ID_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\WebDrivers\\msedgedriver.exe"); 
		WebDriver driver = new EdgeDriver();
		
		//Chrome Driver
		
		//System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		//Hit url
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		
		// Id
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		//Name
		
		driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
		
		//Class
		driver.findElement(By.className("signInBtn")).click();
	}

}
