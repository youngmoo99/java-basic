package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {

		컴퓨터 com1 = new 컴퓨터(200000, "삼성", 27);
		컴퓨터 com2 = new 컴퓨터(150000, "LG", 24);

//		System.out.println("이 모니터의 가격은" + com1.price + "원, 제조회사는" + com1.company + ", 크기는" + com1.inchi + "인치입니다");
//		System.out.println("이 모니터의 가격은" + com2.price + "원, 제조회사는" + com2.company + ", 크기는" + com2.inchi + "인치입니다");
		//컴퓨터 클래스에 toString() 메서드를 생성해주면 
		// 주소를 프린트할때 toString()메서드가 자동호출되어 return한 스트링을 주소대신에 프린트해준다 
		//주소가 가르키는 힙영역의 멤버변수값들을 프린트 
		System.out.println(com1);
		System.out.println(com2);
	}

}
