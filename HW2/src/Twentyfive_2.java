
public class Twentyfive_2 {

	public static void main(String[] args) {
		// (2)54321012345
		//    432101234
		//    3210123
		//    21012
		//    101
		//    0
		//    101 
		//    21012 
		//    3210123 
		//    432101234 
		//    54321012345
		
		int i, j;
		
		for(j = 5; j >= 0; j--)
		{
			for(i = j; i >= 0; i--)
			{
				System.out.print(i);
			}
			for(i = 1; i <= j; i++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
		for(j = 1; j <= 5; j++)
		{
			for(i = j; i >= 0; i--)
			{
				System.out.print(i);
			}
			for(i = 1; i <= j; i++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
		


	}

}
