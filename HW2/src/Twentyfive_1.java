
public class Twentyfive_1 {

	public static void main(String[] args) {
		// (1) *********** 
		//     ********* 
		//     ******* 
		//     ***** 
		//     ***
		//     *
		//     ***  
		//     ***** 
		//     ******* 
		//     ********* 
		//     *********** 
		
		int i, j;
		
		for(j = 1; 11-2*j > 0; j++)
		{
			for(i = 1; i <= 11-2*j; i++)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		for(j = 1; 2*j+1 <= 10; j++)
		{
			for(i = 1; i <= 2*j+1; i++)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

}
