package 스레드;

public class 배열스레드 extends Thread{
	@Override
	public void run() {
		String[] s = {"피자","치킨","돈까스","스파게티","김밥"};
		for (int i = 0; i < s.length; i++) {
			System.out.println("음식이름>> "+s[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
