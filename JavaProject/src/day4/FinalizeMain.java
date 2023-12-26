package day4;

public class FinalizeMain {

	public static void main(String[] args) {
		for(int a=1; a<=5;a++) {
			new Flower();
		}
		System.gc();//Requesting the Garbage Collection to run

	}

}
