package DAY_4;
public class Demo11{
		int x;
		int y;
		int z;
		public Demo11() {
			System.out.println("WELCOME TO MY PROFILE:K.SANJANA");
		}
		public Demo11(int x) {
			this.x=x;
			System.out.println("SSC:"+(x));
		}
		public Demo11(int x,int y) {
			this.x=x;
			this.y=y;
			System.out.println("SSC:" + (x)+" INTER:"+(y));
		}
		public Demo11(int x,int y,int z) {
			this.x=x;
			this.y=y;
			this.z=z;
			System.out.println("SSc:"+(x) + " INTER:" +(y) + " BTECH:"+(z));
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Demo11 d1=new Demo11();
			Demo11 d2=new Demo11(100);
			Demo11 d3=new Demo11(100,836);
			Demo11 d4=new Demo11(100,836,79);
			

		}

	}
	




