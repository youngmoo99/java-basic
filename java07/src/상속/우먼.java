package 상속;

public class 우먼 extends 사람{
	int size;
	
	public void 점프하다() {
		System.out.println("점프하다");
	}

	@Override
	public String toString() {
		return "우먼 [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
	

}
