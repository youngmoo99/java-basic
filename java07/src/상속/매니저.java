package 상속;

public class 매니저 extends 직원{
   int bonus;
   
   public void test() {
      System.out.println("매니저가 테스트를 하고 있네요");
   }

   @Override
   public String toString() {
      return "Manager [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn="
            + rrn + "]";
   }
   
}