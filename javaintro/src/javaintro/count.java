package javaintro;

public class count {
	static int count=0;
	{
	   count++;
	}

	public static void main(String[] args) {
		count c=new count();
		System.out.println("count:"+c.count);
		

	}

}
