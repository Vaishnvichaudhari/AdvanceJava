package Day1;

public class PlanetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Planet ourPlanet = new Planet();
		//ourPlanet.name = "Earth"; This does not compile because 'name' is 'private'
		
		ourPlanet.assignValue("Mars", 1);
		System.out.println("Planets are:" + ourPlanet.retriveValue());
		
		//reteriveValues Fetching 
		String ourPlanetInfo = ourPlanet.retriveValue();
		System.out.println(ourPlanetInfo);

	}

}
