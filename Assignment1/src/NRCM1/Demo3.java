package NRCM1;
interface Youtube{
	void onlineplatform();
}
class Shorts{
	public void  Likes() {
		System.out.println("Yoga shorts");
			}
}
class Instagram extends Shorts implements Youtube{
	public void Share() {
		System.out.println("Whats'app");
	}
	public void onlineplatform() {
		System.out.println("videos in onlineplatform: ");
	}
}
class Home extends Instagram{
	public void Menu() {
		System.out.println("Bell icon");
	}
	
}

public class Demo3 {

	public static void main(String[] args) {
		Instagram p1=new Instagram();
		Home m1=new Home();
		m1.onlineplatform();
		m1.Menu();
		m1.Share();
		p1.Likes();

	}

}


