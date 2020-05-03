

public class MInimumNumber {

	
	public static void main(String[] args) {
		
		System.out.println(findMini(44));
		
}

	private static long findMini(int i) {
		long tempValue =i;
		
		while(tempValue<=Long.MAX_VALUE) {
			
			long currentValue= tempValue;
			long sum=0;
			while(currentValue>0) {
				sum =sum+(currentValue%10);
				currentValue=currentValue/10;
			}
			System.out.println(tempValue);
			if(sum==i && tempValue!=i) {
				return tempValue;
			}
			
			tempValue +=i;
			
		}
		return -1;
		
	}
		
	
}
