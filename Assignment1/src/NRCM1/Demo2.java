package NRCM1;
	interface Employee{
		void name();
	}
	interface id extends Employee{
		void Id();
	}
	class sample implements Employee{
		public void add() {
			System.out.println("Hello");
		}
		public void name() {
			System.out.println("Sanjana");
		}
		public void Id() {
			System.out.println("297");
		}
	}
	class sample2 implements id{
		public void Roll() {
			System.out.println("288");
		}
		public void name() {
			System.out.println("Sreeja");
		}
		public void Id() {
			System.out.println("257");
		}
	}

	public class Demo2 {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			sample s1=new sample();
			sample2 s2=new sample2();
			s1.add();
			s1.name();
			s1.Id();
			s2.Roll();
			s2.name();
			s2.Id();
	        

		}

	}


