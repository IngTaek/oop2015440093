import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		// 11. �Ҽ�(prime-number) �˻�� ����ϰ� ����ڰ� �Է��� ���� �μ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//     ���� ������ 0�� �Է��ϱ� �������� ��� ����(�μ� ���)�ϵ��� �����Ͻÿ�.
		
		Scanner input = new Scanner(System.in);
		
		int number;
		int i = 2;
		
		System.out.print("������ �Է��ϼ��� : ");
		number = input.nextInt();
		
		while (i < number)
		{
			if (number % i == 0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
	}

}
