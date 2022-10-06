package 정적static;

public class 나의일지 {

	public static void main(String[] args) {
		//변수는 선언된 위치를 포함한 괄호안에섬나 사용 가능
		Day day1 = new Day("자바공부",10,"강남역");
		System.out.println(day1); //주소대신 toString 찍힘
		
		System.out.println(Day.count);//static
		
		Day day2 = new Day("파이썬공부",20,"의정부역");
		System.out.println(day2); //주소대신 toString 찍힘
		
		System.out.println(Day.count);//static
		Day day3 = new Day("코틀린공부",30,"신도림역");
		System.out.println(day3); //주소대신 toString 찍힘
		System.out.println(Day.count);//static
		
		System.out.println("전체 하는 일의 시간은 : "+Day.sum_time);
		System.out.println("평균 하는 일의 시간은 : "+Day.avg_time);
		System.out.println(Day.getAvg()+"시간");
		
	}

}
