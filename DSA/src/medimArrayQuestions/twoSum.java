package medimArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twoSum {
	public static void main(String[] args) {
		int arr[]= {1,6,2,10,3};
		int n=arr.length;
		int target=7;
		int ans[]=twoSum(arr,n,target);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] twoSum(int[] arr, int n, int target) {
		Map<Integer, Integer>map= new HashMap<>();
		
		for(int i=0;i<n;i++) {
			int complement=target-arr[i];
		
		if(map.containsKey(complement)) {
			return new int[] {map.get(complement),i};
		}
		map.put(arr[i], i);
		}
		return new int[0];
	}

	
	//Brute Force approach ----time complexity 0(N)*2   Space Complexity-0(1)
//	private static int[] twoSum(int[] arr, int n, int target) {
//		List<Integer>ans=new ArrayList<>();
//		for(int i=0;i<n-1;i++) {
//			for (int j=i+1;j<n;j++){
//				if(arr[i]+arr[j]==target) {
//					ans.add(i);
//					ans.add(j);
//					break;
//				}
//				
//			}
//		}
//			int newAns[]=new int[ans.size()];
//			
//			int s=0;
//			for(Integer elements:ans) {
//				newAns[s++]=elements;
//			}
//		
//		return newAns;
//	}
	

}
