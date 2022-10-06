package 정적static;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum_time; 
	static double avg_time;
	
	
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum_time = sum_time + time;
		avg_time = sum_time / count;
		
	} 
	//일반메서드는 객체생성후, 주소로 접근해서 호출해야함
	//객체생성과 상관없이 기능을 정의하고싶으면 static으로 만들어야함 
	public static double getAvg() {
		return sum_time / (double) count;
	}
	
	//객체 생성후, 객체의 주소가 아니라 그주소가 가르키는 인스턴스변수의 값들을 가지고 String 을 만들어주세요 
	public String toString() {
		return "나의하루 [하는일 ="+doing+", 한 시간="+time+",위치 ="+location;
	}
}
