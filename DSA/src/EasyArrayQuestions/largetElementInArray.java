package EasyArrayQuestions;

public class largetElementInArray {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		int n=arr.length;
	int large=largest(arr,n);
	System.out.println(large);
		
		
	}

	private static int largest(int[] arr, int n) {
		int largest=arr[0];
		for (int i=1;i<n;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}

	
}
		