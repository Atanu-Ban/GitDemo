import java.util.ArrayList;

public class corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable
		
		int mynumbers=56;
		String name="ATANU";
		char letter='T';
		double dec= 5.67;
		Boolean mycard=true;
		{
			System.out.println(mynumbers);
		}
		
		//ARRAY
		
		int[] array=new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		int[]array2= {3,4,6,8,9};
		
		{
			System.out.println(array[4]);
		}
		
		//FOR LOOP
		
		for(int i=0;i<5;i++)
		{
			System.out.println(array[i]);
		}
		
		String[]name1= {"Atanu","Adith","Rohan"};
		
		for(String s:name1)
		{
			System.out.println(s);
		}
		
		//if & ELSE LOOP
		
		int[]array3= {2,3,5,6,8,16,17,18,144};
		for(int i=0;i<array3.length;i++)
			if(array3[i]%2==0)
		{
			System.out.println(array3[i]);
		}
			else
			{
				System.out.println(array3[i]+" "+"Is Not divided by 2");
			}
		
		// ARRAY LIST
		
	     ArrayList <String> a = new ArrayList<String>();
	     a.add("Rahul");
	     a.add("Atanu");
	     {
	     System.out.println(a.get(1));
	     }
	}

}
