import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// 5. �޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("choose one of the following.");
		System.out.println("1. apple");
		System.out.println("2. orange");
		System.out.println("3. banana");
		System.out.println("4. peach");
		System.out.println("");
		System.out.print("enter your choice here : ");
		number = input.nextInt();
		
		System.out.println("--------------------");
		
		if (number == 1)
		{
			System.out.println("Your choice is \"apple\"");
		}
		else if (number == 2)
		{
			System.out.println("Your choice is \"orange\"");
		}
		else if (number == 3)
		{
			System.out.println("Your choice is \"banana\"");
		}
		else if (number == 4)
		{
			System.out.println("Your choice is \"peach\"");
		}
		else
		{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
				
				
	}

}
