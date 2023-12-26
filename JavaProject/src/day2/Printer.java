package day2;

public class Printer {
	private String content;
	

	public Printer() { //this is no argument constructor
		setContent("Good night");
	}
	
	public Printer(String content) { //This is a parameterized accepting 1parameter
		this.content=content;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void print() { //prints the content without any decoration
		System.out.println(content);
	}
	
	public void print(String decoration) //prints the content with decoration
	{
		System.out.println(decoration + content +decoration);
	}
	
  public static void main(String[] args) {
		Printer prn=new Printer();
		prn.print("..");
		
		Printer prn2=new Printer("Good Morning");
		prn2.print("");
		

	}

}
