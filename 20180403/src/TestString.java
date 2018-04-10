
public class TestString {

	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		
		System.out.println(str1.equals(str2));	   // 주소 안에 있는 값들을 비교
		str1 = str2;
		System.out.println(str1 == str2);		   // 주소의 값을 비교
	}

}
