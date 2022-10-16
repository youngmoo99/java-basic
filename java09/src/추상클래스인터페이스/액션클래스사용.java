package 추상클래스인터페이스;

public class 액션클래스사용 {

	public static void main(String[] args) {
		액션처리클래스 action = new 액션처리클래스();
		향상된액션처리클래스 action2 = new 향상된액션처리클래스();
		
		action.click();
		action.doubleClick();
		action2.click();
		action2.doubleClick();

	}

}
