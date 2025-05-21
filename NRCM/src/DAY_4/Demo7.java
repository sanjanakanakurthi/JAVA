package DAY_4;

public class Demo7 {
	int a=56;
	int b=43;
	public Demo7(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y); }
	public void add() {
		System.out.println(this.a-this.b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo7 d1=new Demo7(56,43);
        d1.add();
        
	}

}
