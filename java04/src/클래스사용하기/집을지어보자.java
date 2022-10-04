package 클래스사용하기;

import 클래스만들기.벽돌들;

public class 집을지어보자 {

	public static void main(String[] args) {
		// 모든 부품은 ram에 준비되어 있어야함
		벽돌들 벽돌1 = new 벽돌들();
		
		벽돌1.x = 1;
		벽돌1.y = 2;
		
		벽돌1.쌓다();
		
		벽돌들 벽돌2 = new 벽돌들();
		벽돌2.x = 150;
		벽돌2.y = 150;
		
		
		
		

	}

}
