package 상속활용;

import java.util.Date;

public class 시각스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			Date date = new Date();
			System.out.println(date);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
