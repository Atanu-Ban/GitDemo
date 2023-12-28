
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// If you want to access any method of the class you have to create object of that class
		
		MethodDemo d = new MethodDemo();
		String name = d.getData();
		System.out.println(name);
		getData2();
		String name2 = getData2();
		System.out.println(name2);
	}
	
	//Outside the main block we need to declare method
	//If we want to use any code again and again then we create method
	
	 public String getData() 
	 //getData - Method Name
	 // If the method return any thing that we write in the place of void(String,int)
	 //If the method not return anything then we write Void
	 {
		 System.out.println("Hello World");
		 return "Atanu";
	 }
	 //If you want to access method without create object
	 public static String getData2() 
	 {
		 System.out.println("Hello world2");
		 return "Banerjee";
	 }
	 

}
