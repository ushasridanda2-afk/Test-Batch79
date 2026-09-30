package javaintro;

public class Wrapperclass {
	Integer studentid=9372;
	String studentname="usha";
	Integer age=22;
	Double marks=98.8;
	Character grade='A';
	Boolean passed=true;

	public static void main(String[] args) {
		System.out.println("main method started");
		Wrapperclass w=new Wrapperclass();
		System.out.println("studentid:"+w.studentid);
		System.out.println("studentname:"+w.studentname);
		System.out.println("age:"+w.age);
		System.out.println("marks:"+w.marks);
		System.out.println("grade:"+w.grade);
		System.out.println("passed:"+w.passed);
		System.out.println("main method ended");
	}

}
