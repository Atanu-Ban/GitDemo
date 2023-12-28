
public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number= {2,4,5,6,7,8,9,10,21,22};
		
		for(int i=0;i<number.length;i++)
		
		if(number[i]% 2==0)
		{
			System.out.println("This is  devided by 2: " + number[i]);
		}
		
		else
		{
			System.out.println("This is not devided by 2: " +number[i]);
		}

	}

}
