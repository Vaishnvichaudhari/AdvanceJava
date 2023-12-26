package day2.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller    //Marks this class as a Controller
@SessionAttributes({"progressReport" ,"message"})
public class SpringMvcController {
	
	
	@RequestMapping("/showLogin")
	public String getLoginPage() {
		return "login";   //Returns view name
	}
	
	//This Method will be called when client makes a request for /doValidate url.
	@RequestMapping(value="/doValidate", method=RequestMethod.POST)
	public String getResultPage(@RequestParam("uid")String userName,@RequestParam("pwd")String password) {
		String resultPage="failure";
		User userModdel= new User(userName,password);
		boolean success= UserValidator.isValid(userModdel);
		if(success)
			resultPage="success";
		return resultPage;
	}
	
	@RequestMapping("/studentEntry")
	public String getStudentEntryPage() {
		return "studentEntry";
		
	}
	@RequestMapping(value="acceptStudent" , method=RequestMethod.POST)
	public String processStudentInfo(String studentName , int phy,int chem,int maths ,Model dataModel) {
		int totalMarks=TotalMarksCalculator .getTotalMarks(phy, chem, maths);
		StudentProgress progress= new StudentProgress(studentName,totalMarks);
		//Attaching STudentProgress information to the modell:datamodel
		dataModel.addAttribute("progressReport",progress);
		dataModel.addAttribute("message", "Thank You!");
		return "studentProgress";
		
	}

}
