package 정적static;

public class 직원 {
	String name;
	int age;
	char gender;
	static int person;
	static int total_age;
	
	public 직원(String name, int age, char gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		person++;
		total_age = total_age + age; 
	}

	public static double getAvg() {
		return total_age / (double) person;
	}
	public String toString() {
		return "직원 정보>> 이름 : "+name+", 나이 : "+age+", 성별 : "+gender;
	}
	
}
