package EasyArrayQuestions;

import java.util.Arrays;

public class reverseArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int n=arr.length;
		reverseArray(arr,n);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void reverseArray(int[] arr, int n) {
		int result[] = new int[n];
	     for(int i=0;i<n;i++) {
	    	 result[i]=arr[n-1-i];
	}
	    for(int i=0;i<n;i++) {
	    	arr[i]=result[i];
	    }
	}

}
