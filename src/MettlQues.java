
public class MettlQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	System.out.println(findNumber(9));
	}

	private static int findNumber(int i) {	
		int tempNum=i;		
		while(tempNum<=Integer.MAX_VALUE) {
			int currentNum =tempNum;
			int sum=0;
			while(currentNum>0) {
				sum =sum+(currentNum%10);
				currentNum= currentNum/10;			
		}if(sum==i&&tempNum!=i) 
			return tempNum;
		tempNum+=i;
		}
		if(tempNum>2000)
			return -1;
		return tempNum;
		// TODO Auto-generated method stub
		
	}

}
