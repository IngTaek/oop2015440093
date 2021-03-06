import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		// 15. 1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨), 10번 이내로 그 숫자를 맞추는 게임을 작성하시오.
		// (10번 이내로 못 맞추었을 경우는 약간 머리가 딸리는 사람이므로 Game Over 처리를 신랄하게 해 주기 바람)
		
		Scanner input = new Scanner(System.in);
		
		int guess = 0;
		int tries = 0;
		int answer = 93;
		
		do {
			
			tries++;
			
			System.out.print("정답을 추측하세요 : ");
			guess = input.nextInt();
			
			if(guess > answer)
			{
				System.out.println("정답은 더 낮습니다.");
			}
			if(guess < answer)
			{
				System.out.println("정답은 더 높습니다.");
			}
		} while ((guess != answer) && (tries < 10));
		
		
		if (answer == guess)
		{
			System.out.println("축하합니다. " + tries + "번 만에 맞추셨습니다.");
		}
		else if (tries >= 10)
		{
			System.out.println("10번 동안 못 맞추셨습니다.");
			System.out.println("지능에 상당한 문제가 있습니다.");
		}
}
}
