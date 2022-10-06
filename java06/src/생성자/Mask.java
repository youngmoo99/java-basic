package 생성자;

public class Mask {
	String color;
	int price;
	int count;
	//멤버변수는 전역변수, 전역변수는 자동초기화가 된다.
	
	
	//객체 생성시, 멤버변수값을 바로 넣는 경우 
	//넣을 데이터를 파라미터로 해서 생성자를 반드시 만들어준다
	public Mask(String color, int price, int count) {
		super();
		this.color = color;
		this.price = price;
		this.count = count;
	}
	//계좌처럼 파라미터 없이 객체생성하고싶고, 파라미터있는 개체생성하고 싶은 경우 
	//기본생성자를 명시적으로 써주어야 한다. 
	
	
	
}
