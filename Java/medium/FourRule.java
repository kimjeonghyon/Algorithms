package problem4;

import java.util.ArrayList;
import java.util.List;

public class FourRule {

	double calc (String str) {
		List<Double> ld = new ArrayList<>();
		
		String [] splus = str.split("\\+");
		List<String> lsminus = new ArrayList<>();
		for (String s : splus) {
			if (s.length() == 1) {
				ld.add(Double.parseDouble(s));
			} else if (s.length() == 3) {
				double d1 = Double.parseDouble(s.substring(0, 1));
				double d2 = Double.parseDouble(s.substring(2, 3));

				if (s.contains("*")) {
					ld.add(d1*d2);
				} else if (s.contains("/")) {
					ld.add(d1/d2);
				} else if (s.contains("-")) {
					ld.add(d1-d2);
				} else {
					System.out.println("todo!!");
				}
			} else {
				lsminus.add(s);
			}
		}
	
		
		for (String s : lsminus) {
			String[] sa = s.split("\\-");
			
			for (int i = 0; i< sa.length; i++) {
				String s_as = sa[i];
				if (s_as.length() == 1) {
					double d = Double.parseDouble(s_as);
					if (i == 0) {
						ld.add(d);
					} else {
						ld.add(-d);
					}
					
				} else if (s_as.length() == 3) {
					double d1 = Double.parseDouble(s_as.substring(0, 1));
					double d2 = Double.parseDouble(s_as.substring(2, 3));
	
					if (s_as.contains("*")) {
						ld.add(-d1*d2);
					} else if (s_as.contains("/")) {
						ld.add(-d1/d2);
					} else if (s_as.contains("-")) {
						ld.add(-d1-d2);
					} else {
						System.out.println("todo:" +s);
					}
				} else {
					System.out.println("todo:" +s);
				}
			}
		}
		System.out.println(ld);
		double result = 0.0;
		for (double d:ld) {
			result += d;
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		// 18:10
        String a = "1+2*3+3-1-9-3/6";
        FourRule f = new FourRule();
        
        System.out.println(f.calc(a));
		
	}

}
