package EasyArrayQuestions;

public class countOfOddNumberInArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int n=arr.length;
		int odd =countOfOddInArray(arr,n);
		System.out.println(odd);
	}

	private static int countOfOddInArray(int[] arr, int n) {
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				oddcount++;
			}		
		}
		return oddcount	;
	}
}
