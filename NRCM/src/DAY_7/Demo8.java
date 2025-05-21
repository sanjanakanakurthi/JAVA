package DAY_7;
public class Demo8 {
	static void add(int a,int b) {
		if(b==0) {
					throw  new ArithmeticException("em chusthunavu maths radha"); 
		}
		int c=a/b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		try {
		add(23,0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Covered all keywords");
		}
		

}
}