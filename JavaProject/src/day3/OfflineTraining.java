package day3;

public class OfflineTraining extends Training {
 private String venueDetails;
 
 
public OfflineTraining() {
	 
 }

public OfflineTraining(String moduleName, int duration ,String venueDetails) {
	super(moduleName, duration);
	this.venueDetails=venueDetails;
	}

public String getVenueDetails() {
	return venueDetails;
}

public void setVenueDetails(String venueDetails) {
	this.venueDetails = venueDetails;
}



@Override//Asks compiler to check whether overriding is correct or not
public void conductTraining() {
	System.out.println("conduct the Training at:" + venueDetails);
}

@Override
public String getDetails() {
	String trainingDetails = super.getDetails();//Invoking 'getDetails()' from super class: Training
	String allTrainingDetails = trainingDetails + ", " + venueDetails;
	return allTrainingDetails;
}



 
}
