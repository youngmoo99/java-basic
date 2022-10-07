package 상속;

public class 회사 {

   public static void main(String[] args) {
      직원 s = new 직원();
      s.name="홍길동";
      s.address="해운대";
      s.salary=1000000;
      s.rrn=330;
      System.out.println(s);
      
      매니저 m = new 매니저();
      m.name="홍길이";
      m.address="강남";
      m.salary=30000000;
      m.rrn=331;
      m.bonus=300;
      System.out.println(m);
      m.test();
   }

}