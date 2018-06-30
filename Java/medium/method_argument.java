package test;

public class method_argument {

	
	private static String sum(String ... values) {
		String sum = "";
		for (String i : values) {
			sum +=i;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum("1","2","3","4","5"));

	}

}
