package javaintro;

public class Converteddatatypes {
	int i=546;
	double d=i;
	double D=70.0;
	int I=(int)D;
	char c='F';
	int i1=(int)c;
	int I1=65;
	char c1=(char)I1;
	
	public static void main(String[] args) {
		Converteddatatypes c =new Converteddatatypes();
		System.out.println("int:"+c.i);
		System.out.println("int to double:"+c.d);
		System.out.println("double:"+c.D);
		System.out.println("double to int:"+c.I);
		System.out.println("char:"+c.c);
		System.out.println("char to int:"+c.i1);
		System.out.println("int:"+c.I1);
		System.out.println("int to char:"+c.c1);
	}

}
