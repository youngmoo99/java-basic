package 생성자;

public class 은행가서통장만들기 {

	public static void main(String[] args) {
		통장 dad = new 통장("홍길동","902910",10000000);
		System.out.println(dad.name+dad.ssn+dad.money);

	}

}
