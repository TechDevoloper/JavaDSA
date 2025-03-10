package EasyArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class countOfEvenOdd {
public static void main(String[] args) {
	int arr[]= {1, 2, 3, 4, 5};
	int n=arr.length;
	int finalResult[] =countOfEvenOdd(arr,n);
	System.out.println(Arrays.toString(finalResult));
}

private static int[] countOfEvenOdd(int[] arr, int n) {
	int result []= new int[2];
	HashMap<Integer,Integer>map=new HashMap<>();
	for(int i=0;i<n;i++) {
	map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
}
 //convert for Each in for loop 
	List<Integer>list=new ArrayList<>(map.values());
	
 for(int i=0;i<list.size();i++) {
	 int count=list.get(i);
	 
	 if(count%2==0) {
		 result[0]++;
	 }else {
		 result[1]++;
	 }
 }
 return result;

}
}

