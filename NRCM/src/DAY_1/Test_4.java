package DAY_1;

public class Test_4 {
  int s=10;
  static int r=6,l=8,b=4;
   void circle() {
	   System.out.println(3.14*r*r);
   }
   static void rec() {
	   System.out.println(l*b);
   }
   void square() {
	   System.out.println(s*s);
   }
   static void triangle() {
	   int b=4,h=7;
	   System.out.println(b*h/2);
   }
   public static void main(String[] args) {
	   Test_4 t4=new Test_4();
	   t4.circle();
	   rec();
	   t4.square();
	   triangle();
			
   }
  

}
