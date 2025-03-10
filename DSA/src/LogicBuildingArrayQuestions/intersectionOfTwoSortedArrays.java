package LogicBuildingArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersectionOfTwoSortedArrays {
	public static void main(String[] args) {
		int arr1[]= {1,2,2,1};
		int arr2[]= {2,2};
		
		int intersection[]=intersection(arr1,arr2);
		System.out.println(Arrays.toString(intersection));
	}

	//Optimal Approach
	private static int[] intersection(int[] arr1, int[] arr2) {
		int n1=arr1.length;
		int n2=arr2.length;
		int i=0,j=0;
		List<Integer>list=new ArrayList<>();

		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
			else {
				if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                
			
				}
				i++;
				j++;
			}
		}
		int ans[]=new int[list.size()];
		int s=0;
		for(Integer element:list) {
			ans[s]=element;
		}
		return ans;
	}

	//Brute Force Approach
//	private static int[] intersection(int[] arr1, int[] arr2) {
//		int n1=arr1.length;
//		int n2=arr2.length;
//		List<Integer>list=new ArrayList<>();
//		int visited[]=new int [n2];
//		
//		for(int i=0;i<n1;i++) {
//			for(int j=0;j<n2;j++) {
//				if(arr1[i]==arr2[j] && (visited[j]==0)) {
//					list.add(arr1[i]);
//					visited [j]=1;
//					break;
//				}
//				else if(arr2[j]>arr1[i]) {
//					break;
//				}
//			}
//		}
//			//conversion of arrayList into Array
//			
//			int ans[]=new int [list.size()];
//			
//		for(int s=0;s<ans.length;s++) {	
//			ans[s]=list.get(s);
//		}
//		
//		
//		 return ans;
//	}
	
	
	
	
}