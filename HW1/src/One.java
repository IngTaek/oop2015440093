import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// 1. 두 수(정수)를 입력 받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.
		int a, b;
		
		Scanner input = new Scanner(System.in);    // 다음에 설명할 것임.
		System.out.print("첫번째 정수를 입력하시오 : ");
		a = input.nextInt(); // 키보드에 숫자 입력
		System.out.print("두번째 정수를 입력하시오 : ");
		b = input.nextInt(); // 키보드에 숫자 입력
		
		if(a > b)
		{
			System.out.println("큰 수는 " + a + "입니다.");
		}
		else
		{
			System.out.println("큰 수는 " + b + "입니다.");
		}
		System.out.println("===============프로그램 종료===============");
	}

}
