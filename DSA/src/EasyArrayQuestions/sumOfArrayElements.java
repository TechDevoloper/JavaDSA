package EasyArrayQuestions;

public class sumOfArrayElements {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int n=arr.length;
		int sum =sumOfArrayElements(arr,n);
		System.out.println(sum);

}

	private static int sumOfArrayElements(int[] arr, int n) {
      int currentSum = 0;
	for(int i=0;i<n;i++) {		
    	  currentSum+=arr[i];
      }
	 return currentSum;

   	}
	
	
}
