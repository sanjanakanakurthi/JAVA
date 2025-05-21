package DAY_3;

public class Test_9 {

	public static void main(String[] args) {
		int[] arr= {23,45,56,78};
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
	}
	     System.out.println(min);
}
}



