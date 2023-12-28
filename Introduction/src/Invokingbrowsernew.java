import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Invokingbrowsernew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This code for unable to establish websocket connection
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//Webdriver but //co add for the websocket connection error
		WebDriver driver =new ChromeDriver(co);
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER.exe");


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

//Quit the browser( All associate windows get closed)

driver.quit();

	}
	
	

}
