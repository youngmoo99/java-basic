package 스레드;

public class 동시프로그램실행2 {

	public static void main(String[] args) {
		골뱅이스레드 t1 = new 골뱅이스레드();
		달러스레드 t2 = new 달러스레드();
		앤드스레드 t3 = new 앤드스레드();
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
