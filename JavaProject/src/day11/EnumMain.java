package day11;

import java.util.Arrays;
import java.util.List;

public class EnumMain {

	public static void main(String[] args) {
		TrainingProgram p1= new TrainingProgram();
		TrainingProgram p2= new TrainingProgram("Stress Management" ,2,TrainingMode.HYBRID);
		TrainingProgram p3= new TrainingProgram("Communication Skills" ,2,TrainingMode.HYBRID);
		TrainingProgram p4= new TrainingProgram("Interview Skills",2,TrainingMode.ONLINE);
		TrainingProgram p5= new TrainingProgram("Share Market" ,3, TrainingMode.ONLINE);
		
		List<TrainingProgram> allTrainingProgram = Arrays.asList(p1,p2,p3,p4,p5);
		
		for(TrainingProgram currentProgram : allTrainingProgram) {
			TrainingMode currentMode=currentProgram.getModeOdTraining();
			if(currentMode.equals(TrainingMode.HYBRID)){
			  System.out.println(currentProgram.getName());
				
			}
		}

	}

}
