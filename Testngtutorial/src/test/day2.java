package test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
@Test  (groups= {"smoke"})
	public void Day2() 
	{
		// TODO Auto-generated method stub
System.out.println("Good");
	}

@BeforeClass
public void beforeclass()
{
System.out.println("Before execute any method before class execute");	
}

@AfterClass
public void afterclass()
{
System.out.println("After execute method after class execute");	
}

@BeforeSuite
public void beforesuite()
{
System.out.println("I am before suite");
}




@BeforeTest

public void beforetest()
{
	System.out.println("This is the before test");
}

}
