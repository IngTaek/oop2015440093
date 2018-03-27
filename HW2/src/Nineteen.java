import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		// 19. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 
		// 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		Scanner input = new Scanner(System.in);
		
		int i = 2;
		int n;
		
		
		System.out.print("소수인지 아닌지 검사할 정수를 입력하세요 : ");
		n = input.nextInt();
		
		while ((i < n) && (n % i != 0))
		{
			i++;
		}
		
		if (i >= n)
		{
			System.out.println("입력하신 정수는 소수입니다.");
		}
		else if (n % i == 0)
		{
			System.out.println("입력하신 정수는 소수가 아닙니다.");
		}

	}

}
