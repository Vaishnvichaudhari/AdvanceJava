package day3;

public class OnlineTraining extends Training {
    private String meetingLink;
    
    
public OnlineTraining() {
	
	}

public OnlineTraining(String moduleName, int duration) {
		super(moduleName, duration);
		// TODO Auto-generated constructor stub
	}


public String getMeetingLink() {
		return meetingLink;
	}


public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}


@Override
public void conductTraining() {
	System.out.println("Conducting the training by connecting to : " + meetingLink);
}


}
