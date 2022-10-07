package 스레드;

public class 동시프로그램실행3 {

	public static void main(String[] args) {
		카운터스레드 t1 = new 카운터스레드();
		배열스레드 t2 = new 배열스레드();
		시각스레드 t3 = new 시각스레드();
		t1.start();
		t2.start();
		t3.start();

	}

}
