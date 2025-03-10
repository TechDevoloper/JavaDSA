package medimArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threeSum {
	public static void main(String[] args) {
		int arr[]= {2,-2,0,3,-3,5};
		int n=arr.length;
		List<List<Integer>>ans=threeSum(arr,n);
		System.out.println(ans);
	}

	
	//Brute Force 0(N3)
//	private static List<List<Integer>> threeSum(int[] arr, int n) {
//		Set<List<Integer>>set=new HashSet<>();
//
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				for(int k=j+1;k<n;k++) {
//					if(arr[i]+arr[j]+arr[k]==0) {
//				        List<Integer> temp = new ArrayList<>();
//						temp.add(arr[i]);
//						temp.add(arr[j]);
//						temp.add(arr[k]);
//						
//						Collections.sort(temp);
//						set.add(temp);
//					}
//				}
//			}
//			
//		}
//		
//		return new ArrayList<>(set);
//	
//	}
//}
	
	//Better 0(N2)
	private static List<List<Integer>> threeSum(int[] nums, int n) {
		 List<List<Integer>> res = new ArrayList<>();
	        Arrays.sort(nums);

	        for (int i = 0; i < nums.length; i++) {
	            if (i > 0 && nums[i] == nums[i-1]) {
	                continue;
	            }
	            
	            int j = i + 1;
	            int k = nums.length - 1;

	            while (j < k) {
	                int total = nums[i] + nums[j] + nums[k];

	                if (total > 0) {
	                    k--;
	                } else if (total < 0) {
	                    j++;
	                } else {
	                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
	                    j++;

	                    while (nums[j] == nums[j-1] && j < k) {
	                        j++;
	                    }
	                }
	            }
	        }
	        return res;        
	    }
	}
		
	
		
		

