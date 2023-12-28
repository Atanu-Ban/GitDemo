package atanuacademy.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productcatelogue {
		
		WebDriver driver;
		public Productcatelogue(WebDriver driver)
		{
			//initilization
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

		
		
		//Page Factory
		@FindBy(className="col-lg-4")
		List<WebElement> products;
		
	}


