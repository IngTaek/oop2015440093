import java.util.Scanner;

public class Twentyone {

	public static void main(String[] args) {
		// 21. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner input = new Scanner(System.in);
		
		int number;
		int sum = 0;
		int x;
		int i;
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		number = input.nextInt();
		
		if (number == 1)
		{
			System.out.println(number + "������ �Ҽ��� ���� 0 �Դϴ�.");
		}
		else if (number == 2)
		{
			System.out.println(number + "������ �Ҽ��� ���� 2 �Դϴ�.");
		}
		else if (number >= 3)
		{
			for(x = 3; x <= number; x++)
			{
				i = 2;
				
				while((i < x) && (x % i != 0))
				{
					i++;
				}
				
				if (i == x)
				{
					sum = sum + x;
				}
				
			}
		}
		
		System.out.println(number + "������ �Ҽ��� ���� " + (sum + 2) + "�Դϴ�.");

		
	}

}