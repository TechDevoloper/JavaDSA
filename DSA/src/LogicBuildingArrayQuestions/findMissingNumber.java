package LogicBuildingArrayQuestions;

import java.util.Arrays;

public class findMissingNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5 };// o-p
		int n = arr.length + 1;
		int miss = missing(arr, n);
		System.out.println(miss);

	}

	private static int missing(int[] arr, int n) {

			int sum=n*(n+1)/2;
			int s2=0;
			int miss=0;
			for(int i=0;i<arr.length;i++) {
				s2+=arr[i];
			}
			miss=sum-s2;
			
			return miss;
		}
		
	}

//	private static int missing(int[] arr, int n) {
//		// Brute Force
//		for (int i = 1; i <= n; i++) {
//			int flag = 0;
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j] == i) {
//					flag = 1;
//					break;
//				} 	
//			}
//
//			if (flag == 0) {
//				return i;
//			}
//
//		}
//		return -1;
//	}
//}
