package DAY_5;
class Chocolate{
	void eating() {
		System.out.println("Tasty");
	}
}
class Dark extends Chocolate{
	void taste1() {
		System.out.println("dark chocolate is tasty");
	}
}
class Sweet extends Chocolate{
	void taste2() {
		System.out.println("dark chocolate is sweet");
	}
}
class Bournvilla extends Dark{
	void cost1() {
		System.out.println("dark chocolate is 100");
	}
}
class Amul extends Dark{
	void cost2() {
		System.out.println("dark chocolate is 200");
	}
}
class Dairymilk extends Sweet{
	void Weight1() {
		System.out.println("100grms");
	}
}
class Kitkat extends Sweet{
	void Weight2() {
		System.out.println("50grms");
	}
}
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bournvilla b1=new Bournvilla();
       Amul a1=new Amul();
       Dairymilk d1=new Dairymilk();
       Kitkat k1=new Kitkat();
       b1.eating();
       b1.taste1();
       b1.cost1();
       a1.eating();
       a1.taste1();
       a1.cost2();
       d1.eating();
       d1.taste2();
       d1.Weight1();
       k1.eating();
       k1.taste2();
       k1.Weight2();
       
	}
}

