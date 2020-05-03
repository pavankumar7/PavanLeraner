package Pavan;

public class MyClass {

	public static void main(String[] args) {
		
		CricketCoach ch = new CricketCoach();
		FortuneService fs = new HappyFortune();
		ch.setService(fs);
		ch.getDailyWorkout();
		ch.getFortune();

		
	}

}
