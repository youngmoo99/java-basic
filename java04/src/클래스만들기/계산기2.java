package 클래스만들기;

public class 계산기2 {
	public int add(int x, int y) { //add(100,200)
		return x+y;
	}
	public double add(int x, double y) {
		return x+y;
	}
	public double add(double x, double y) {
		return x+y;
	}
	public String add(String x, String y) {
		return x+y;
	}
	
	public int[] add() {
		int[] num = {1,2,3};
		return num;
	}
	public int multi(int x, int y) {
		return x*y;
	}
	public double div(double x, double y) {
		return x / y;
	}
}
