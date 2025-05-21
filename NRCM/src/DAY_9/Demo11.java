package DAY_9;
import java.util.*;

public class Demo11 {

	public static void main(String[] args) {
		Map<Integer,String> m1=new LinkedHashMap<Integer,String>();
		m1.put(7, "cse");
		m1.put(6, "ece");
		m1.put(3, "eee");
		m1.put(4, "civil");
		m1.put(5, "da");
		m1.put(2, "aiml");
		m1.put(1, "cs");
		System.out.println(m1);
		for(Map.Entry<Integer,String> i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}
	}

}




