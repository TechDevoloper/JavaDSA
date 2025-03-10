package EasyArrayQuestions;

public class maximumConsecutiveOnes {
	public static void main(String[] args) {
		int arr[]= {1,1,0,0,1,1,1,0};
		int n=arr.length;
		int max =maximumConsecutiveOne(arr,n);
		System.out.println(max);			
			
		}

		private static int maximumConsecutiveOne(int[] arr, int n) {
			int maximumConsecutive=0;
			int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				count++;
				maximumConsecutive=Math.max(maximumConsecutive, count);
			}
			else  {
				count=0;
			}
			
		}
		return maximumConsecutive;
	}

		
	}

