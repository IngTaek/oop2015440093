import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		// 9. ���� �������� 1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������, 
		// �� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� 
		// �ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.(�Է��� ��ȿ�� �˻�)

		Scanner input = new Scanner(System.in);
		
		int n;
		int i = 1;
		
		System.out.print("����� �������� ���� �Է��ϼ��� : ");
		n = input.nextInt();

		if(n<1 || n>9)
		{
			while(n<1 || n>9)
			{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				System.out.print("����� �������� ���� �Է��ϼ��� : ");
				n = input.nextInt();
			}
		}
		
		while (i <= 9)
		{
		System.out.println(n + "*" + i + "=" + (n*i));
		i++;
		}
		
	}

}