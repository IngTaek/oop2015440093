import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// 7. 0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오.
		
		Scanner input = new Scanner(System.in);
		
		int number;
		int sum = 0;
		
		
		do {
			System.out.println("정수를 입력하세요 : ");
			System.out.println("종료를 하려면 0을 입력하세요.");
			number = input.nextInt();
			
			sum = sum + number;
		} while (number != 0);
		
		System.out.println(sum);
	}

}
