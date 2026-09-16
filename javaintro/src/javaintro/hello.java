package javaintro;

public class hello {
	protected void finalize() {
		System.out.println("finalize method called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		hello h1 = new hello();
		
		hello h2 = new hello();
		
		hello h3 = new hello();
		
		h1=null;
		h2=h3;
		System.gc();
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}

}
