import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// 3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		int x, y, z, compare1, compare2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		x = input.nextInt(); // Ű���忡 ���� �Է�
		
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		y = input.nextInt(); // Ű���忡 ���� �Է�
		
		System.out.print("����° ������ �Է��ϼ��� : ");
		z = input.nextInt(); // Ű���忡 ���� �Է�
		
		if(x >= y)
		{
			compare1 = x;
		}
		else
		{
			compare1 = y;
		}
		
		if(compare1 >= z)
		{
			compare2 = compare1;
		}
		else
		{
			compare2 = z;
		}
		
		System.out.println("���� ū ���� " + compare2 + "�Դϴ�.");


		

		

	}

}
