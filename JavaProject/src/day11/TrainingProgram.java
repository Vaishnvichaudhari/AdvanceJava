package day11;

public class TrainingProgram {
	private  String name;
	private int duration;
	private TrainingMode modeOdTraining;


	public TrainingProgram() {
		// TODO Auto-generated constructor stub
		name="Art of living";
		duration=3;
		 modeOdTraining=TrainingMode.OFFLINE;
	}
	
	public TrainingProgram(String name,int duration , TrainingMode modeOfTraining) {
		this.name=name;
		this.duration = duration;
		this.modeOdTraining = modeOfTraining;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}


	public TrainingMode getModeOdTraining() {
		return modeOdTraining;
	}


	public void setModeOdTraining(TrainingMode modeOdTraining) {
		this.modeOdTraining = modeOdTraining;
	}

	
	@Override
	public String toString() {
		return "TrainingProgram [name=" + name + ", duration=" + duration + ", modeOdTraining=" + modeOdTraining + "]";
	}
}
