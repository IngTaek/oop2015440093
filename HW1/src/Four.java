import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// 4. ����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// (A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		
		Scanner input = new Scanner(System.in);
		
		int score;
		
		System.out.print("������ �Է��Ͻÿ� : ");
		score = input.nextInt();
		
		if( score >= 80)
		{
			System.out.println("A");
		}
		else if( score >= 60)
		{
			System.out.println("B");
		}
		else if( score >= 40)
		{
			System.out.println("C");
		}
		else if( score >= 20)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		
	}

}
