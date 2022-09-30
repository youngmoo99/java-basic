package 클래스사용하기;

import 클래스만들기.TV;
import 클래스만들기.강아지;
import 클래스만들기.전화기;

public class 내방 {

	public static void main(String[] args) {
		전화기 p1 = new 전화기();
		p1.통화하다();
		p1.color = "검정";
		전화기 p2 = new 전화기();
		p2.사진을찍다();
		p2.color = "흰색";
		System.out.println("전화기색" + p1.color + " 카메라색" + p2.color);

		강아지 dog = new 강아지();
		dog.color = "흰색";
		dog.filed = "말티즈";
		dog.짖다();
		dog.꼬리를흔들다();
		System.out.println("우리집 강아지는 " + dog.color + "에" + dog.filed);

		TV tv = new TV();
		tv.inchi = 55;
		tv.company = "삼성";
		tv.넷플릭스();
		tv.디즈니플러스();
		System.out.println("우리집 tv는 " + tv.inchi + "인치 " + tv.company);

	}

}
