package EasyArrayQuestions;

import java.util.Arrays;

public class linearSearch {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,3};
		int n=arr.length;
		int target=3;
	int position=	linearSearch(arr,n,target);
	System.out.println(position);
		
		
	}

	private static int linearSearch(int[] arr, int n, int target) {
		int position=0;
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				position=i;
				return position;
			}
		}
		return -1;
	
	
}
}
		
		