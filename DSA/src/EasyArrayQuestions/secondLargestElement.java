package EasyArrayQuestions;

import java.util.Arrays;

public class secondLargestElement {
	public static void main(String[] args) {
		int arr[] = {8,8,7,6,5};
		int n = arr.length;
		int second = secondLargest(arr, n);
		System.out.println(second);

	}

	private static int secondLargest(int[] arr, int n) {
		int secondLargest=Integer.MIN_VALUE;
		int largest=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
				
			}
			else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
		}
		 return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
	}

	//Brute Force
//	private static int secondLargest(int[] arr, int n) {
//		Arrays.sort(arr);
//		int secondLargest = 0;
//		int largest = arr[n - 1];
//		for (int i = n - 2; i >= 0; i--) {
//			if (arr[i] != largest) {
//				return secondLargest = arr[i];
//
//			}
//		}
//		return -1;
//
//	}
	

}
