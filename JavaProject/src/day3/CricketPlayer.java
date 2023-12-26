package day3;

public class CricketPlayer extends Player {
    private float battingAvg;
    
    
	public CricketPlayer() {
		System.out.println("In CricketPlayer()");
	}
	
	public CricketPlayer(String name, int age, float battingAvg) {
		super(name, age); //Invokes the constructor from player class
		this.battingAvg = battingAvg;
	}
	

	public float getBattingAvg() {
		return battingAvg;
	}
	
	public void setBattingAvg(float battingAvg) {
		this.battingAvg = battingAvg;
	}

}
