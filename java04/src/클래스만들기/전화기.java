package 클래스만들기;

public class 전화기 {
	public String color;
	public String shape;
		// 공통적인 성질 : 사이즈, 스피커 
		// 변수를 사용, 2개의 변수 필요
		// 멤버변수 , 값을 넣지않고 선언만! 
		
		int size; //0으로 자동초기화 
		String speaker; //""으로 자동초기화 
		
		//자동 초기화 시켜주는것 -> 멤버변수, 배열 
		
		
		//동작(기능)을 정의 : 통화하다 사진을찍다 
		public void 통화하다() {
			//처리 내용을 순서대로 써준다 
			System.out.println("보이스톡");
			System.out.println("디스코드");
		}
		
		public void 사진을찍다() {
			System.out.println("카메라");
			System.out.println("갤러리");
		}
	}


