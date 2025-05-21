package DAY_6;

public class Demo5 {
	void Show() {
		System.out.println("hi");
	}
	class Test1{
		void Print()
		{		System.out.println("Hello");
	}
}
	public static void main(String[] args) {
		Demo5 d1 =new Demo5();
		d1.Show();
		Demo5.Test1 t1 =new Demo5() . new Test1();//nested inner class
		t1.Print();
		

	}

}
