import java.util.Scanner;

public class Twentyone {

	public static void main(String[] args) {
		// 21. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		
		Scanner input = new Scanner(System.in);
		
		int number;
		int sum = 0;
		int x;
		int i;
		
		System.out.print("양의 정수를 입력하세요 : ");
		number = input.nextInt();
		
		if (number == 1)
		{
			System.out.println(number + "이하의 소수의 합은 0 입니다.");
		}
		else if (number == 2)
		{
			System.out.println(number + "이하의 소수의 합은 2 입니다.");
		}
		else if (number >= 3)
		{
			for(x = 3; x <= number; x++)
			{
				i = 2;
				
				while((i < x) && (x % i != 0))
				{
					i++;
				}
				
				if (i == x)
				{
					sum = sum + x;
				}
				
			}
		}
		
		System.out.println(number + "이하의 소수의 합은 " + (sum + 2) + "입니다.");

		
	}

}
