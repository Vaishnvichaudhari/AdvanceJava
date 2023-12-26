package Day1;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m1=new Movie(); //object of Movie class
		
		//Setting Values
		m1.setTittle("Asus");
		m1.setGenre("TheGamer");
		m1.setYear(2002);
		
		//Getting value/Fetching Data
		System.out.println("Tittle is: " + m1.getTittle());
		System.out.println("Genre is: " + m1.getGenre());
		System.out.println("Year: " + m1.getYear());
		

	}

}
