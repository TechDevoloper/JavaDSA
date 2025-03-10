package EasyArrayQuestions;

import java.util.Arrays;

public class leftRotateArrayByOne {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		int n=arr.length;
	rotate(arr,n);
	System.out.println(Arrays.toString(arr));
		
		
	}

	private static int[] rotate(int[] arr, int n) {
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
		return arr;
	}
}
