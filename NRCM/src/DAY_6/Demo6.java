package DAY_6;
public class Demo6{//outer class
	void show() {//outer method
		System.out.println("Good evening");
		class Test2{// inner class
			void print() {//inner method
				System.out.println("Good night");
				}
			}
		Test2 t1 = new Test2();//inner class obj
		t1.print();
		
		
	}

	public static void main(String[] args) {
		Demo6 d1=new Demo6();
		d1.show();//outer class object

	}

}
