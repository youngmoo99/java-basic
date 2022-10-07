package 상속;

public class 맨 extends 사람 {
	//멤버변수 이미 2개 
	int size;
	
	//멤버메서드 10(object 8 + 2)개 
	public void 달리다() {
		System.out.println("빨리달리다");
	}

	@Override
	public String toString() {
		return "맨 [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
	
}
