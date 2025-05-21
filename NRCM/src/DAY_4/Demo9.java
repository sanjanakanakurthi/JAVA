package DAY_4;

public class Demo9 {
	int x;
	int y;
	int z;
	public Demo9() {
		System.out.println("hi");
		
	}
	public Demo9(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Demo9(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		Demo9 d1=new Demo9();
		Demo9 d2=new Demo9();
		Demo9 d3=new Demo9();
	}

}
