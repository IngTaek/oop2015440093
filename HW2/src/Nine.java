import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		// 9. 위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니, 
		// 이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 
		// 다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)

		Scanner input = new Scanner(System.in);
		
		int n;
		int i = 1;
		
		System.out.print("출력할 구구단의 단을 입력하세요 : ");
		n = input.nextInt();

		if(n<1 || n>9)
		{
			while(n<1 || n>9)
			{
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
				System.out.print("출력할 구구단의 단을 입력하세요 : ");
				n = input.nextInt();
			}
		}
		
		while (i <= 9)
		{
		System.out.println(n + "*" + i + "=" + (n*i));
		i++;
		}
		
	}

}
