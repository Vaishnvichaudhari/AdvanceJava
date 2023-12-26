package day3;

public class Training {
  private String moduleName;
  private int duration;
  
 public Training() {
	  
  }
  
public Training(String moduleName, int duration) {
	super();
	this.moduleName = moduleName;
	this.duration = duration;
}

public String getModuleName() {
	return moduleName;
}

public void setModuleName(String moduleName) {
	this.moduleName = moduleName;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

public void conductTraining() {}

public String getDetails() {
	String trainingDetails =moduleName + "," + duration;
	return trainingDetails;
}
  
}
