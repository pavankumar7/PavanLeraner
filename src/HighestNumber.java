
public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		highestNum(37,7);
	}

	private static void highestNum(int num, int d) {
		
		char c = Integer.toString(d).charAt(0);
		
		for(int i =num;i>0;i--) {
			//checking whteher my number contain index of d.  if present it will return 0 not present -1
			if(Integer.toString(i).indexOf(c) == -1) {
				System.out.println(i);
		         break;
			}
		}
	}

}
