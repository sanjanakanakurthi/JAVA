package DAY_5;
class Movie{
	void genre() {
		System.out.println("Crime and thriller");
	}
}
class Hit extends Movie{
	void action() {
		System.out.println("Investigation");
	}
}
class Hero extends Hit{
	void name() {
		System.out.println("Nani");
	}
}
class Heroin extends Hit{
	void acting() {
		System.out.println("excellent");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		Hero a1=new Hero();
		Heroin h1=new Heroin();
		a1.genre();
		a1.action();
		a1.name();
		h1.acting();
		
	}

}
