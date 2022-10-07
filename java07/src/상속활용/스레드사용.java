package 상속활용;

public class 스레드사용 {

	public static void main(String[] args) {
		// 1.Thread 상속받아 클래스 3개를 만들어놓음 
		// 2. new 이용해서 객체사용 
		시각스레드 시각 = new 시각스레드();
		카운터스레드 카운터 = new 카운터스레드();
		이미지스레드 이미지 = new 이미지스레드();
		
		시각.start();
		카운터.start();
		이미지.start();

	}

}
