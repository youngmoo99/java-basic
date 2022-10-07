package 스레드;

public class 카운터스레드2 extends Thread {

	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트>> " + i);

			// cpu 1초씩 쉬엇다가 실행시켜줘라고 설정
			// ms 1000이 1초
			// 자바프로그램에서 외부자원(db, cpu, network, file)을 연결할때는
			// 프로그램이 중단되는 위험한 상황으로 인식되어
			// 그런상황이 발생했을때 어떻게 할지를 반드시 써주어야함 ==> 예외처리

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
