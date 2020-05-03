
public class rotateArray {
	
	public static void main(String[] args) {
		int[] arr = rotArray(new int[] {1,2,3,4,5,6},3);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] rotArray(int[] is, int d) {
		int lent =is.length;
		
		for(int k=0;k<d;k++) {
			int j=0;
			int temp=is[j];
			for(j=0;j<is.length-1;j++) {
				is[j]=is[j+1];
			}
			is[j]=temp;
		}
		
		return is;
	}

}
