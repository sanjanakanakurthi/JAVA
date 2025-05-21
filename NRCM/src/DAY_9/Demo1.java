package DAY_9;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();//three
		l1.add(12);
		l1.add(45);
		l1.add(67);
		List<Integer> l2=new ArrayList<Integer>(11);//one
		l2.add(12);
		l2.add(45);
		l2.add(67);
		//l2.addAll(11);
		//l2.add(null);
		System.out.println(l2);
	}

}
