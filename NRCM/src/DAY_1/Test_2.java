package DAY_1;

public class Test_2 {
int a=25,b=78;// instance
static int x=71,y=72;// static

    void not() {
	    int p=29,q=32;
	       System.out.println(!(p<q));
    }
    public static void main(String[] args) {
	Test_2 t2=new Test_2();
	System.out.println((t2.a<t2.b)&&(t2.a==t2.b));
	System.out.println((Test_2.x<Test_2.y)||(Test_2.x==Test_2.y));
	t2.not();
   }

}
