package atanuacademy.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
		
		WebDriver driver;
		public Landingpage(WebDriver driver)
		{
			//initilization
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

		//WebElement userEmail = driver.findElement(By.id("userEmail"));
		
		//Page Factory
		@FindBy(id="userEmail")
		WebElement userEmail;
		
		@FindBy(id="userPassword")
		WebElement userPasswordele;
		

		@FindBy(id="login")
		WebElement login;
		
		
		//Action Method
		public void loginapplication(String email ,String password) 
		{
			userEmail.sendKeys("email");
			userPasswordele.sendKeys("password");
			login.click();
		}
		
		public void goTo()
		{
			driver.get("https://www.rahulshettyacademy.com/client");
		}
	}


