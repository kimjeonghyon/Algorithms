package aaa;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lg = "LG";
		Student3 st = new Student3(lg);
		Student3.setSt(lg);
		System.out.println(Student3.getSt());

	}

}

class Student3 {
	public static String st = "BEST";

	Student3 (String str) {
		Student3.st += str;
		System.out.println("Const:" + Student3.st);
	}
	
	public static String getSt() {
		return Student3.st;
	}

	public static void setSt(String st) {
		Student3.st += st;
	}

	
}