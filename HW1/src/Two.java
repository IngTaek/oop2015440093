import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		//2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int x =0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		x = input.nextInt(); // Ű���忡 ���� �Է�
		
		if(x % 2 == 0)
		{
			System.out.println("�Է� ���� ������ ¦���Դϴ�.");
		}
		else
		{
			System.out.println("�Է� ���� ������ Ȧ���Դϴ�.");
		}
		
	}

}