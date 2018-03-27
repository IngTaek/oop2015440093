import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		//13. month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. 
		//    (switch문 사용) //1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		
		Scanner input = new Scanner(System.in);
				
		int month, days;
		int days_count = 0;
		
		System.out.print("달을 입력하세요. : ");
		month = input.nextInt();
		
		System.out.print("일을 입력하세요. : ");
		days = input.nextInt();
		
		switch(month)
		{
		case 1:
			{
				days_count = 0;
				break;
			}
		case 2:
			{
				days_count = 31;
				break;
			}
		case 3:
			{
				days_count = 31+28;
				break;
			}	
		case 4:
			{
				days_count = 31+28+31;
				break;
			}
		case 5:
			{
				days_count = 31+28+31+30;
				break;
			}	
		case 6:
			{
				days_count = 31+28+31+30+31;
				break;
			}	
		case 7:
			{
				days_count = 31+28+31+30+31+30;
				break;
			}	
		case 8:
			{
				days_count = 31+28+31+30+31+30+31;
				break;
			}	
		case 9:
			{
				days_count = 31+28+31+30+31+30+31+31;
				break;
			}	
		case 10:
			{
				days_count = 31+28+31+30+31+30+31+31+30;
				break;
			}	
		case 11:
			{
				days_count = 31+28+31+30+31+30+31+31+30+31;
				break;
			}	
		case 12:
			{
				days_count = 31+28+31+30+31+30+31+31+30+31+30;
				break;
			}	
		}
		
		days_count += days;
		
		System.out.println("1월 1일부터 입력하신 날까지의 총 일수는 " + days_count + "일 입니다.");
		
	}

}
