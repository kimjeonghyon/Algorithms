package test;

import java.util.Arrays;

class Copies implements Cloneable {
	int a;
	StringBuffer b;
	String[] c;
	public Copies(int a, StringBuffer b, String[] c) {
		//super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void mobB_append(String str) {
		b.append(str);
	}
	public void mobC_second(String str) {
		c[1] = str;
	}
	@Override
	public String toString() {
		return "Copies [a=" + a + ", b=" + b.toString()+ ", c=" + Arrays.toString(c) + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Copies cp = (Copies)super.clone();
		
		cp.b = new StringBuffer(b.toString());
		
		cp.c = Arrays.copyOfRange(this.c, 0, this.c.length);
		
		return cp; 
	}
	
	
	
	
}
public class Clone {

	
	public static void main(String[] args) {

	   String [] astr = {"111","222","333"};
	   
	   StringBuffer sb = new StringBuffer();
	   sb.append("abc");
	   
	   Copies cp1 = new Copies(99, sb, astr);
	   Copies cp2 = null;
	   
	   try {
		cp2 = (Copies)cp1.clone();
	   } catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }

	   System.out.println("===before======");
	   System.out.println("cp1" + cp1 );
	   System.out.println("cp2" + cp2 );
	   

	   System.out.println("===after======");	   
	   cp1.a = 100;
	   cp1.mobB_append("def");
	   cp1.mobC_second("444");
	   System.out.println("cp1" + cp1 );
	   System.out.println("cp2" + cp2 );

	}

}
