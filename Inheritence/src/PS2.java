
public class PS2 extends PS3{
//Default constractor called
	int a;//Class Variable
	public PS2(int a) //Instace Variable
	{
	//constractor name always be a class name
		super(a); //Parent class constractor is invocked
		this.a=a; //this keyword reffer to the current class variable
		
	}

	public int increment() 
	{
		a=a+1;
		return a;
	}
		
		public int decrement() 
		{
			a= a-1;
			return a;

	    }

}
