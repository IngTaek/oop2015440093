import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		//13. month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		//    (switch�� ���) //1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
		
		Scanner input = new Scanner(System.in);
				
		int month, days;
		int days_count = 0;
		
		System.out.print("���� �Է��ϼ���. : ");
		month = input.nextInt();
		
		System.out.print("���� �Է��ϼ���. : ");
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
		
		System.out.println("1�� 1�Ϻ��� �Է��Ͻ� �������� �� �ϼ��� " + days_count + "�� �Դϴ�.");
		
	}

}
