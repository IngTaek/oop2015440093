
public class Twentythree {

	public static void main(String[] args) {
		// 23.***** *
		//	  *** ***
		//	  * *****
		int i, j;
		
		for (j = 1; j <=3; j++)
		{
			for(i = 1; i<= 7; i++)
			{
				if(i == 8-2*j)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			
			System.out.print("\n");
		}
	}

}
