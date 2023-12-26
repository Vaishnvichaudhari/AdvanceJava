package day3;

public class TennisPlayer extends Player{
   private int aces;
   
   
public TennisPlayer() {
		System.out.println("In TennisPlayer()");
	}

public TennisPlayer( String name, int age ,int aces) {
	super(name,age);
	this.aces = aces;
}


public int getAces() {
	return aces;
}

public void setAces(int aces) {
	this.aces = aces;
}

}
