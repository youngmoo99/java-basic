package 상속;

public class 상속사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		
		p.gender = "남자";
		p.name = "클라크";
		System.out.println(p);
		
		맨 m = new 맨();
		m.gender="남자";
		m.name ="데이비드";
		m.size= 100;
		
		System.out.println(m);
		
		수퍼맨 superman = new 수퍼맨();
		superman.gender="남자";
		superman.name="윌리엄";
		superman.size = 200;
		System.out.println(superman);
		superman.날아다니다();
		superman.달리다();
		superman.먹다();
		superman.잠자다();
		
		스파이더맨 spider = new 스파이더맨();
		spider.gender ="남자";
		spider.name ="피터파커";
		spider.size =90;
		
		spider.벽을탄다();
		System.out.println(spider);
		
		우먼 woman = new 우먼();
		woman.gender ="여자";
		woman.name ="그웬";
		woman.size =40;
		System.out.println(woman);
		woman.점프하다();
		
		원더우먼 wonder = new 원더우먼();
		wonder.name="다이애나";
		wonder.size=250;
		wonder.gender ="여자";
		System.out.println(wonder);
		wonder.강하다();
		
		

	}

	

}
