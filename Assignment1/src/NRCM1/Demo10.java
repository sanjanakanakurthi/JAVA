package NRCM1;
interface I14{
	void trip();
}
interface I21{
	void tour();
}
interface I76{
	void art();
}
interface I4{
	void paint();
}
class Sample1 implements I14,I21,I76{
	public void trip() {
		System.out.println("visiting");
	}
	public void tour() {
		System.out.println("touring");
	}
	public void art() {
		System.out.println("artist");
	}
	public void music() {
		System.out.println("listening");
	}
}
public class Demo10 extends Sample1 implements I4{
	public void paint() {
		System.out.println("painting");
	}
    public void weather() {
    	System.out.println("cool");
    }
	public static void main(String[] args) {
		Demo10 t=new Demo10();
        t.trip();
        t.tour();
        t.art();
        t.music();
        t.paint();
        t.weather();
	}
}
