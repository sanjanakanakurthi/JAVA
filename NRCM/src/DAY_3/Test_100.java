package DAY_3;

public class Test_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,45,56,78};
		int[] arr1=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
		if(count==1) {
			arr1[index++]=arr[i];
			
		}
		}
		System.out.println("No repeated: ");
		for(int i=0;i<index;i++) {
			 System.out.print(arr[i]+" ");
}
}
	}

