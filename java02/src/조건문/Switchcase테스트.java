package 조건문;

public class Switchcase테스트 {

	public static void main(String[] args) {
		String name ="자바";
		
		switch (name) {
		case "자바":
			System.out.println("1103호로");
			break;
		case "파이썬":
			System.out.println("1102호로");
			break;
		case "c언어":
			System.out.println("1101호로");
			break;

		default:
			System.out.println("카운터로 가세요");
			break;
		}

	}

}
