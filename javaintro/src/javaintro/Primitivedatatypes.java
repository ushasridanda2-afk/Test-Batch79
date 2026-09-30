package javaintro;

public class Primitivedatatypes {
	byte b=22;
	short s=480;
	int i=500000;
	long l=340000000l;
	float f=8.14f;
	double d=5225.25d;
	char c='F';
	boolean boo=true;

	public static void main(String[] args) {
		System.out.println("main method started");
		Primitivedatatypes p = new Primitivedatatypes();
		System.out.println("byte:"+p.b);
		System.out.println("short:"+p.s);
		System.out.println("int"+p.i);
		System.out.println("long:"+p.l);
		System.out.println("float:"+p.f);
		System.out.println("double:"+p.d);
		System.out.println("char:"+p.c);
		System.out.println("boolean:"+p.boo);
		System.out.println("main method ended");
	}

}
