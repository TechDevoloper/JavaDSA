package medimArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leadersInArray {
	public static void main(String[] args) {
			int arr[] = { 1,2,5,3,1,2};// i-p
			int n=arr.length;
			int leaders[] = leaders(arr, n);
			System.out.println(Arrays.toString(leaders));

		}

	private static int[] leaders(int[] arr, int n) {
	   //1 using two pointers
		List<Integer>list=new ArrayList<>();
		int max=arr[n-1];
		list.add(max);
		for(int i=n-2;i>=0;i--) {
			
				if(arr[i]>max) {
					 list.add(arr[i]);
					 max=arr[i];
				
			}
		}
			int leader[]=new int[list.size()];
			int s=0;

				
			for(Integer element:list) {
				leader[s++]=element;
			}
			
		return leader;
	}


	}


