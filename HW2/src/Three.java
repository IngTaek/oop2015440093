
public class Three {

	public static void main(String[] args) {
		// 3. 1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� 
		//    ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(while�� ���)
		
		int i = 0;
		int sum = 0;
		
		while (i <= 100)
		{
			sum = sum + i;
			i = i + 3;
		}
		
		System.out.println(sum);
	}

}
