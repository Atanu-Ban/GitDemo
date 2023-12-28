package atanuacademy.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Stand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("118");
        //options.addArguments("--disable-notifications");
        //options.addArguments("disable-features=DownloadUI");
        //options.addArguments("--excludeSwitches=enable-automation");

        
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver(options);
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		
		
		
		Landingpage landingpage = new Landingpage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Register
		driver.get("https://www.rahulshettyacademy.com/client");
		driver.manage().window().maximize();

		driver.findElement(By.className("text-reset")).click();
		driver.findElement(By.id("firstName")).sendKeys("Atanu");
		driver.findElement(By.id("lastName")).sendKeys("Banerjee");
		driver.findElement(By.id("userEmail")).sendKeys("banerjeeatanu690@gmail.com");
		driver.findElement(By.id("userMobile")).sendKeys("7003018854");
		
		//Handle Static dropdown
	WebElement	StaticDropdown =driver.findElement(By.className("custom-select"));
	Select dropdown = new Select(StaticDropdown);	
	dropdown.selectByIndex(3);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
	//Handle Static Radio Button
	
	//WebElement radio = driver.findElement(By.className("form-group"));
	driver.findElement(By.className("mt-3")).click();
	
	driver.findElement(By.id("userPassword")).sendKeys("1q2w3e4R@");
	driver.findElement(By.id("confirmPassword")).sendKeys("1q2w3e4R@");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.id("login")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//Login
	driver.findElement(By.linkText("Login here")).click();
	driver.findElement(By.id("userEmail")).sendKeys("banerjeeatanu690@gmail.com");
	driver.findElement(By.id("userPassword")).sendKeys("1q2w3e4R@");
	driver.findElement(By.id("login")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//WAIT
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("b")));
	String productslist = "ZARA COAT 3";
	//Get Product List
	
	List<WebElement> products = driver.findElements(By.className("col-lg-4"));
	WebElement prod = products.stream().filter(product->product.findElement(By.cssSelector("b"))
	.getText().equals(productslist)).findFirst().orElse(null);
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//Click on cart
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
	driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
	
	//FIND PRODUCT ON THE CART PAGE
	List<WebElement> cartproducts= driver.findElements(By.xpath("//*[@class='cartSection']/h3"));
	boolean match =cartproducts.stream().anyMatch(cartproduct->cartproduct.getText().equalsIgnoreCase(productslist));
	//Assert.assertTrue(match);
	
	//CLICK ON CHECKOUT BUTTON
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".totalRow button")));
	driver.findElement(By.cssSelector(".totalRow button")).click();
	
	// HANDLE STATIC DROPDOWN WITH ACTION CLASS
	
	Actions a = new Actions(driver);
	a.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")),"india").build().perform();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
	
	driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
	driver.findElement(By.cssSelector(".action__submit")).click();
	
	String confirmMessage= driver.findElement(By.cssSelector(".hero-primary")).getText();
	Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
    driver.close();	
		
	}

}
