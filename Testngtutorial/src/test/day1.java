package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@Parameters({"URL","URL2"})
		@Test
		public void Demo(String URL,String URL2 )
		{
        System.out.println("Hello");//automation
        System.out.println(URL);
        System.out.println(URL2);
	    }
		
		@BeforeMethod
		
	public void bmethod()
	{
			System.out.println("This is before method");
	}
		
		@AfterMethod
		public void amethod()
		
		{
			System.out.println("This is after method");
		}
		
		@Test(dataProvider="getData")
		
		public void secondtestcase(String Username,String Password)
		{
			System.out.println("Good Bye");
			System.out.println(Username);
			System.out.println(Password);
		}
		
		@AfterTest
		
		public void aftertest()
		{
			System.out.println("This is run last");
		}
		
		@DataProvider
		public Object[][] getData()
		{
			// 1st combination - Username and password- Good credit score
			// 2nd combination - user name password - No credit score
			// 3rd combination - Fraduent credit history
			
			Object[][] data = new Object[3][2];
			//Set 1
			data[0][0]="firstsetusername";
			data[0][1]="firstsetpassword";
			
			//Set 2
			
			data[1][0]="secondsetusername";
			data[1][1]="secondsetpassword";
			
			//Set 3
			data[2][0]="thirdsetusername";
			data[2][1]="thirdtsetpassword";
			return data;
			
		}

}
