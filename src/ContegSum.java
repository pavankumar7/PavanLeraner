
public class ContegSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findSubArray(new int[]{20, 15, 12, 8, 6, 32}, 26);
	}

	private static void findSubArray(int[] is, int d) {
		
		int sum = is[0];
		int start =0;
		
		for(int i = 1;i<is.length;i++) {
			sum=sum+is[i];
			
			while(sum > d && start <= i-1) {
				sum=sum-is[start];
				start++;
			}
			
			if(sum==d) {
				for(int j =start;j<=i;j++) {
					System.out.println(is[j]);
				}
			}
		}
	}

}
