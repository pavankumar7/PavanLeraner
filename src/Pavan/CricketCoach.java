package Pavan;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	@Override
	public void getDailyWorkout() {
		
		System.out.println("bowl 5 overs");
	}

	@Override
	public void getFortune() {
fortuneService.getDailyFortune();
	}
	
	public void setService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

}
