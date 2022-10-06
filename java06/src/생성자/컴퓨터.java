package 생성자;

public class 컴퓨터 {
	int price;
	String company;
	int inchi;

	public 컴퓨터(int price, String company, int inchi) {

		this.price = price;
		this.company = company;
		this.inchi = inchi;
	}
	public String toString() {
		return "컴퓨터 가격"+price+"제조회사"+company+"사이즈"+inchi;
	}

}
