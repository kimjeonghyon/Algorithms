import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalcAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String dd = "18";
		String mm = "06";
		String yyyy = "2007";
		
		Calendar cBirthDate = Calendar.getInstance();
		cBirthDate.set(2007,6,18);
		System.out.println(cBirthDate.getTime());
		Calendar cNow = Calendar.getInstance();
		
		System.out.println(cNow.getTime());
		System.out.println(cBirthDate.getTime());
		System.out.println((cNow.getTime().getTime() - cBirthDate.getTime().getTime())/(1000*60*60*24));
		
		
		int age = cNow.get(Calendar.YEAR) - cBirthDate.get(Calendar.YEAR);
		
		System.out.println("year age == " + age);
		
		if(cNow.get(Calendar.MONTH) < cBirthDate.get(Calendar.MONTH)) age --;
		if(cNow.get(Calendar.MONTH) == cBirthDate.get(Calendar.MONTH) && cNow.get(Calendar.DAY_OF_MONTH) < cBirthDate.get(Calendar.DAY_OF_MONTH)) 
			age --;
		
		
		System.out.println("age == " + age);
	}

}
