
public class FindMissingNumaber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		int arr []= {1,3,4};
		
		int sumOfNumber = sumofNumbers(n);
		int sumOfElem =sumOfEle(arr);
		
		int miss = sumOfNumber - sumOfElem;
		
		System.out.println(miss);
	}

	private static int sumOfEle(int[] arr) {
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

	private static int sumofNumbers(int n) {
		// TODO Auto-generated method stub
		return (n * (n+1))/2;
	}

}
