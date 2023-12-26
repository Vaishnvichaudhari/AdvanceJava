package day3;

public class InheritanceMain {

	public static void main(String[] args) {
		CricketPlayer cp=new CricketPlayer();
		TennisPlayer tp=new TennisPlayer();
		cp.setName("Shubhman Gill");
		cp.setAge(26);
		cp.setBattingAvg(98.2f);
		
		//Remaining code to get and print values
		System.out.println(cp.getName());

	}

}
