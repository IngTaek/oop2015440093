import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int sum;
		
		System.out.println(0x10);
		
		String letter = "글자를 받는다.h";
		System.out.println(letter.length());
		
		
		
		System.out.print("첫 번째 숫자를 입력하시오: ");
		x = input.nextInt();
		
		System.out.print("두 번째 숫자를 입력하시오: ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.print(sum);
		
	}

}
