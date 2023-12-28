import org.testng.annotations.Test;

public class PS1 extends PS {

	@Test
	public void test(){
		
		PS2 ps2=new PS2(3);//Create Object // Parameterized constractor
		
		// when you create object and when you not send any parameter PS2 ps2=new PS2()
		// When you send any parameter then we need to called constractor PS2 ps2=new PS2(3)
	   int a =3;
       doThis();//Parent Class
       System.out.println(ps2.increment());//Print incremented number
       System.out.println(ps2.decrement()); // Print decrement number
      
       
       //PS3 ps3=new PS3(a);
       System.out.println(ps2.multiplytwo()); // Print multiply value
    
    		
	}

}
