package 클래스만들기;

public class 계좌 {
	public String name; 
	public String account; 
	public int price;
	
	public void 입금하다() {
		System.out.println(name +"이 "+ price +"원을 입금하다");
	}
	public void 출금하다() {
		System.out.println(name+"이 "+account+"에서 출금하다");
	}
}
