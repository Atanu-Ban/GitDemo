package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day4 {
	@Parameters({"URL"})

		@Test
		public void Demo(String URL)
		{
        System.out.println("Hello");//automation
        System.out.println(URL);
	    }	
		
		@Test
		public void secondtestcase()
		{
			System.out.println("Good Bye");
		}
		
		@Test
		public void Atest()
		{
			System.out.println("Atest");
		}
		
		@Test
		public void Btest()
		{
			System.out.println("Btest");
		}
		

}
