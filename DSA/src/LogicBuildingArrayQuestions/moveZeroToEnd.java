package LogicBuildingArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class moveZeroToEnd {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,0,5,6,0,4};
		int n=arr.length;
	move(arr,n);
	System.out.println(Arrays.toString(arr));
		
		
	}

//	private static void move(int[] arr, int n) {
//		int position=-1;
//		for(int i=0;i<n;i++) {
//			if(arr[i]==0) {
//			arr[position++]=arr[i];
//				
//			}
//		}
//		for(int i=position+1;i<n;i++) {
//			if(arr[i]!=0) {
//				 int temp = arr[i];
//	                arr[i] = arr[position];
//	                arr[position] = temp;
//	                
//	                position++;
//	}
//		}
//	}
	
	private static void move(int[] arr, int n) {
		int position=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
			arr[position]=arr[i];
			position++;
				
			}
		}
		while(position<n) {
			arr[position++]=0;
		}
	}
}
	

	
	//Brute Force Approach
//	private static void move(int[] arr, int n) {
//		// TODO Auto-generated method stub
//		//1 ] store non zero to temp
//		int count=0;
//		int temp[]=new int [n];
//		for(int i=0;i<n;i++) {
//			if(arr[i]!=0) {
//				temp[count++]=arr[i];
//			}
//		}
//		//2 now put temp array to original array
//		for(int i=0;i<temp.length;i++) {
//			arr[i]=temp[i];
//		}
//		//3 rd step put 0 at the end
//		int nonzeroarray=temp.length;
//		
//		for(int i=nonzeroarray;i<n;i++) {
//			arr[i]=0;
//		}
//	}
	
	//Optimal Approach
	// 1)Catch the first 0
	
	
	
	





