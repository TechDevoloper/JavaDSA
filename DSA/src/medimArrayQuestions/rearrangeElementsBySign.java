package medimArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rearrangeElementsBySign {
	public static void main(String[] args) {
		int arr[] = { 1,2,-5,-3,1,-4};// i-p
		int n=arr.length;
		int rearrange[] = rearrange(arr, n);
		System.out.println(Arrays.toString(rearrange));

	}
    
	//Optimal Approach
	private static int[] rearrange(int[] arr, int n) {
	int posIndex=0;
	int negativeIndex=1;
	
	int ans[]=new int[n];
	
	for(int i=0;i<n;i++) {
		if(arr[i]<0) {
			ans[negativeIndex]=arr[i];
			negativeIndex=negativeIndex+2;
		}
		else {
			ans[posIndex]=arr[i];
			posIndex=posIndex+2;
		}
		
	}
	
		return ans;
	}
}

	//Brute Force Approach
//	private static int[] rearrange(int[] arr, int n) {
//		//1st add positive and negative elements in positiove[] and negative[]
//		
//		List<Integer>positive=new ArrayList<>();
//		List<Integer>negative=new ArrayList<>();
//
//		for(int i=0;i<n;i++) {
//			if(arr[i]>0) {
//				positive.add(arr[i]);
//			}
//			else {
//				negative.add(arr[i]);
//			}
//	}
//		 for (int i = 0; i < n / 2; i++) {
//	            arr[2 * i] = positive.get(i);
//	            arr[2 * i + 1] = negative.get(i);
//	        }
//	        
//	        // Return the result
//	        return arr;
//	    }
//		
//
//	}