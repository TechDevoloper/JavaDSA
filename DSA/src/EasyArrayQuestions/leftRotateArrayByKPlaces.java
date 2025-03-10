package EasyArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class leftRotateArrayByKPlaces {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int n=arr.length;
		int k=3;
	left(arr,n,k);
	System.out.println(Arrays.toString(arr));
		
		
	}

//Brute ForceApproach
//	private static int[] left(int[] arr, int n,int k) {
////		k=k%n;
//		//1st step in list add element
//	int	temp[]=new int[k];
//		for(int i=0;i<k;i++) {
//			temp[i]=arr[i];
//		}
//		for(int i=k;i<n;i++) {
//			arr[i-k]=arr[i];
//		}
//		for(int i=n-k;i<n;i++) {
//			arr[i]=temp[i-(n-k)];
//		}
//		return arr; 
//	}
//}
	//Optimal Approach

	private static void left(int[] arr, int n, int k) {
		revrseArray(arr,0, k-1);
		revrseArray(arr, k, n-1);
		revrseArray(arr, 0, n-1);
		
	}
	private static void revrseArray(int[] arr, int left, int right) {
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		
	}
	
}
}



