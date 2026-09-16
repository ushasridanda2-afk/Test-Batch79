package javaintro;

public class Cricket {
//declaration
	//static variables
	static int Countryid;
	static String Countryname;
	//instance variables
	int jersynumber;
	String cricketername;

//main method
	public static void main(String[] args) {
//initialization	 
	 Countryid=1;
	 Countryname="india";
//accessing	 
	 System.out.println("Countryid :" + Countryid);
	 System.out.println("Countryname :" + Countryname);
//accessing instance data in static area is not possible 
//	 directly so we are creating object for instance data 
	 Cricket dhoni = new Cricket(); //creation of object
	 dhoni.jersynumber=7;
	 dhoni.cricketername="Msdhoni";
	 System.out.println("jersynumber :" +dhoni.jersynumber);
	 System.out.println("cricketername:" +dhoni.cricketername);
	 
	 Countryid=2;
	 Countryname="Australia";
	 System.out.println("Countryid :" + Countryid);
	 System.out.println("Countryname :" + Countryname);
		
	 Cricket vk = new Cricket();
	 vk.jersynumber=5;
	 vk.cricketername="smith";
	 System.out.println("jersynumber :" +vk.jersynumber);
	 System.out.println("cricketername:" +vk.cricketername);
	 
	 
	 System.out.println("Countryid :" + Countryid);
	 System.out.println("Countryname :" + Countryname);
		
	 Cricket vkk = new Cricket();
	 vkk.jersynumber=8;
	 vkk.cricketername="smithjh";
	 System.out.println("jersynumber :" +vkk.jersynumber);
	 System.out.println("cricketername:" +vkk.cricketername);

	}

}
