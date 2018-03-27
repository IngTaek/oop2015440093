import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// 6. 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		
		Scanner input = new Scanner(System.in);

		int number;
		int a;
		int b;
		
		System.out.print("정수를 입력하시오 : ");
		number = input.nextInt();
		
		a = number / 10;
		b = number % 10;
		
		System.out.print("출력 : " + b + a);
				
	}

}
