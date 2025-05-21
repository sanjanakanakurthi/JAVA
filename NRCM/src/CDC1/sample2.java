package CDC1;

class sample21 {
	public void add() {
		System.out.println("public");
	}
}
	public class sample2 extends sample21{
	public static void main(String[] args) {
		sample2 s1=new sample2();
		s1.add();
	}

}

