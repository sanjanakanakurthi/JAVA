package DAY_9;
import java.util.*;
public class Demo10 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(null,null);
		m1.put(null,null);
		m1.put(3, "eee");
		m1.put(4, "civil");
		m1.put(5, "da");
		m1.put(6, "aiml");
		m1.put(7, "cs");
		System.out.println(m1);
		for(Map.Entry<Integer,String> i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}
	}

}



