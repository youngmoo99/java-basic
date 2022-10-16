package 추상클래스인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer apple = new AppleComputer();
		BananaComputer banana = new BananaComputer();
		
		apple.삼성전자();
		apple.LG전자();
		apple.ASUS();
		
		banana.삼성전자();
		banana.LG전자();
		banana.ASUS();
		
	}

}
