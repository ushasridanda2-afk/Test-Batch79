package javaintro;

public class College {
	int stdid;
	int stdcgpa;
	String stdname;
	// static
	static  {
		System.out.println("collegename: Raghu Engineering College");
	}
	// instance
	{
		System.out.println("Student object is created");
	}
	void hello() {
		System.out.println("stid:"+stdid+"stdcgpa:"+stdcgpa+"stdname:"+stdname);
	}

	public static void main(String[] args) {
    
    College c = new College();
    c.stdid=546;
    c.stdcgpa=8;
    c.stdname="Ushasri";
    c.hello();
	}
	

}
