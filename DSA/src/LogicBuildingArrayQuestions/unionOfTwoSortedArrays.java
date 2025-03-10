package LogicBuildingArrayQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class unionOfTwoSortedArrays {
	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]= {3,4,5,6};
		
		int union[]=union(arr1,arr2);
		System.out.println(Arrays.toString(union));
	}

	private static int[] union(int[] arr1, int[] arr2) {
	int n1=arr1.length;
	int n2=arr2.length;
	Set<Integer>set= new HashSet();
	for(int i=0;i<n1;i++) {
		set.add(arr1[i]);
		}
	for(int i=0;i<n2;i++) {
		set.add(arr2[i]);
	}
	int union[]=new int[set.size()];
	int i=0;
	for(Integer element:set) {
		union[i]=element;
		i++;
	}
    Arrays.sort(union);

	return union;
}

	//Brute Force Approach
//	private static int[] union(int[] arr1, int[] arr2) {
//		int n1=arr1.length;
//		int n2=arr2.length;
//		Set<Integer>set= new TreeSet<>();
//		for(int i=0;i<n1;i++) {
//			set.add(arr1[i]);
//			}
//		for(int i=0;i<n2;i++) {
//			set.add(arr2[i]);
//		}
//		int union[]=new int[set.size()];
//		int i=0;
//		for(Integer element:set) {
//			union[i]=element;
//			i++;
//		}
//		return union;
//	}
		
	

}
