package DAY_3;

public class Test_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,45,56,78};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			}
        
	     System.out.println("Max:"+max);
}
}


