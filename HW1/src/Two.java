import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		//2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.
		int x =0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		x = input.nextInt(); // 키보드에 숫자 입력
		
		if(x % 2 == 0)
		{
			System.out.println("입력 받은 정수는 짝수입니다.");
		}
		else
		{
			System.out.println("입력 받은 정수는 홀수입니다.");
		}
		
	}

}
