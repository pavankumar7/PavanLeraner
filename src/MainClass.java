
public class MainClass extends Mythread{

	
	public static void main(String[] args) {
		Mythread trd = new Mythread();
		trd.start();
		
		try {
			trd.sleep(10);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		trd.stopThreading(false);
	}
	
}

class Mythread extends Thread{
	
	private static boolean flag=true;
	
	public void stopThreading(boolean value){
		flag=value;
	}
	
	@Override
	public void run() {
		while(flag) {
			System.out.println("i'm running..");
		}
		System.out.println("i stopped..");
	}
	
}