import java.util.ArrayList;
import java.util.List;


public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Atanu");
		name.add("Rohan");
		name.add("Anup");
		
		System.out.println(name.get(2));
		
		//Iterating arraylist with 
		
		for(int i=0;i<name.size();i++)
		{
			System.out.println(name.get(i));
		}
		
		//Item is present in array List
		
	System.out.println(name.contains("Rohan"));
	
	for (String val :name)
	{
		System.out.println(val);
	}
	
	//Normal Arraylist to convert ArrayList
	
	String[] num = {"Atanu","Adith","Sridarshini"};
    List<String> numArraysList= Arrays.asList(num);
    numArraysList.contains("Atanu");
	
				

	}

}
