package javaintro;

public class Shop {
	static int totalmoney=450;
	static int chocolateprice = 15;
	static int cookiesprice =10;
	static int chocolate=10;
	static int cookies=5;
	public static void main(String[] args) {

	int chocolatecost=chocolate*chocolateprice;
    int cookiescost=cookies*cookiesprice;
    int totalcost=chocolatecost+cookiescost;
    int bill=totalmoney-totalcost;
     System.out.println(bill);
	}   
    
}
