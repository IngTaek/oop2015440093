import java.util.Scanner;

public class Seventeen {
	
	public static void main(String[] args) {
		
		// 17. 1���� 100������ ���� for loop�� �Ἥ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner input = new Scanner(System.in);
		
		int i;
		int sum = 0;
		
		for (i = 1; i <= 100; i++)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);
	}

}