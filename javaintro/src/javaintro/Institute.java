package javaintro;

public class Institute {

	static String Trainername1;
	static String Trainername2;
	int Employeeid;
    String Employeename;
    String Employeedesignation;
    public static void main(String[] args) {
    	Trainername1= "viswa";
    	Trainername2="srikanth";
    	System.out.println("Trainername1:"+Trainername1);
    	System.out.println("Trainername2:"+Trainername2);
    	
    Institute vikas = new Institute(); 
    vikas.Employeeid=1;
    vikas.Employeename="usha";
    vikas.Employeedesignation="jfs";
    System.out.println("Employeeid:" +vikas.Employeeid);
    System.out.println("Employeename:" +vikas.Employeename);
    System.out.println("Employeedesignation:" +vikas.Employeedesignation);

     
	}
}

