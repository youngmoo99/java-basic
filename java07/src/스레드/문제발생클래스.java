package 스레드;

public class 문제발생클래스 {

	public static void main(String[] args) {
		System.out.println("1.프린트잘됨");
		try {
			System.out.println("2. 문제발생 코드"+10/0);
		} catch (Exception e) {
			System.out.println("에러 발생함");
			System.out.println(e.getMessage());
		}
		System.out.println("3. 저는 프린트되나요?");
	}

}
