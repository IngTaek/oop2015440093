import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		// 15. 1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.
		// (10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ� Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)
		
		Scanner input = new Scanner(System.in);
		
		int guess = 0;
		int tries = 0;
		int answer = 93;
		
		do {
			
			tries++;
			
			System.out.print("������ �����ϼ��� : ");
			guess = input.nextInt();
			
			if(guess > answer)
			{
				System.out.println("������ �� �����ϴ�.");
			}
			if(guess < answer)
			{
				System.out.println("������ �� �����ϴ�.");
			}
		} while ((guess != answer) && (tries < 10));
		
		
		if (answer == guess)
		{
			System.out.println("�����մϴ�. " + tries + "�� ���� ���߼̽��ϴ�.");
		}
		else if (tries >= 10)
		{
			System.out.println("10�� ���� �� ���߼̽��ϴ�.");
			System.out.println("���ɿ� ����� ������ �ֽ��ϴ�.");
		}
}
}