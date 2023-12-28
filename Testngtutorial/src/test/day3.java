package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day3 {
@Test(groups= {"smoke"})
public void mobiletestcase()
{
System.out.println("mobiletestcase1");
}

@Test(groups= {"smoke"})
public void mobilelogin()
{
System.out.println("mobilelogin2");
}

@AfterSuite
public void aftersuite()
{
System.out.println("I am the after suite");	
}

@Test
public void mobilelogout()
{
System.out.println("mobilelogout3");
}
}
