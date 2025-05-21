package DAY_5;
public class Demo7 {
	void show() {
		System.out.println("Good morning");
	}
	void show(int a,int b) {
		System.out.println(a+b);
	}
	void show(double d1,double d2) {
		System.out.println(d1-d2);
	}
	void show(String s1,String s2) {
		System.out.println(s1+s2);
	}
	public static void main(String[] args) {
		Demo7 d1=new Demo7();
		d1.show();
		d1.show(34,54);
		d1.show(70,35);
		d1.show("sanju","aishu");
	}

}