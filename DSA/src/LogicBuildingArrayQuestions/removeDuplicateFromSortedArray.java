package LogicBuildingArrayQuestions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class removeDuplicateFromSortedArray {
	
		public static void main(String[] args) {
			int arr[]= {1,1,1,2,3,4,4};
			int n=arr.length;
			int unique=removeDuplicate(arr,n);
			System.out.println("The array after removing duplicate elements is ");
	        for (int i = 0; i < unique; i++) {
	            System.out.print(arr[i] + " ");
	        }
		}

		private static int removeDuplicate(int[] arr, int n) {
			 if (n == 0) {
		            return 0;
		        }
			int j=0;
			for(int i=1;i<n;i++) {
				if(arr[j]!=arr[i]) {
					j++;
					arr[j]=arr[i];
				}
			}
			return j+1;
		}
			
		//Optimal Approach
		
		

		
		       


	
}
