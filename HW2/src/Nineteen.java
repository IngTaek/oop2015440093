import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		// 19. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� 
		// �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner input = new Scanner(System.in);
		
		int i = 2;
		int n;
		
		
		System.out.print("�Ҽ����� �ƴ��� �˻��� ������ �Է��ϼ��� : ");
		n = input.nextInt();
		
		while ((i < n) && (n % i != 0))
		{
			i++;
		}
		
		if (i >= n)
		{
			System.out.println("�Է��Ͻ� ������ �Ҽ��Դϴ�.");
		}
		else if (n % i == 0)
		{
			System.out.println("�Է��Ͻ� ������ �Ҽ��� �ƴմϴ�.");
		}

	}

}