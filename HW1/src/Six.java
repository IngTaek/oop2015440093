import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// 6. � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner input = new Scanner(System.in);

		int number;
		int a;
		int b;
		
		System.out.print("������ �Է��Ͻÿ� : ");
		number = input.nextInt();
		
		a = number / 10;
		b = number % 10;
		
		System.out.print("��� : " + b + a);
				
	}

}