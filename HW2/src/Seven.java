import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// 7. 0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.
		
		Scanner input = new Scanner(System.in);
		
		int number;
		int sum = 0;
		
		
		do {
			System.out.println("������ �Է��ϼ��� : ");
			System.out.println("���Ḧ �Ϸ��� 0�� �Է��ϼ���.");
			number = input.nextInt();
			
			sum = sum + number;
		} while (number != 0);
		
		System.out.println(sum);
	}

}