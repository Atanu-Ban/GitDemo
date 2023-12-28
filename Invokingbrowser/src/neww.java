import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class neww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver_win32.exe");


//Start Browser
driver.get("https:google.com");

//Know Title
driver.getTitle();
System.out.println(driver.getTitle());

//Know the current URL

driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());

//Close the browser ( Only current windows close)

driver.close();

// Quit the browser( All associate windows get closed)

driver.quit();





	}

}
