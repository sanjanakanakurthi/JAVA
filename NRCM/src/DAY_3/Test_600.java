package DAY_3;

public class Test_600 {

		// TODO Auto-generated method stub
		
		abstract class fest{
			abstract void add();
			abstract void sub();
			void div() {
				int a=20,b=10;
				System.out.println(a/b);
			}
			void mod() {
				int a=10,b=20;
				System.out.println(a%b);
			}
			static void mul() {
				int a=10,b=20;
				System.out.println(a*b);
			}
			static void mlti() {
				int a=50,b=20;
				System.out.println(a*b);
			}
		}
		class candy extends fest{
			public void add() {
				int a=10,b=20;
				System.out.println(a+b);
			}
			public void sub() {
				int a=20,b=10;
				System.out.println(a-b);
			}
			void sbt() {
				int a=30,b=10;
				System.out.println(a-b);
			}
		}
		class DAY_600{
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				candy d1=new candy();
				d1.add();
				d1.sub();
				d1.div();
				d1.mod();
				fest.mul();
				fest.mlti();
				d1.sbt();
			}
		}
	}


