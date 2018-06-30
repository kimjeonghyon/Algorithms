package problem5;

import java.util.ArrayList;
import java.util.List;

public class SumReverse {

	List<Integer> calc(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<>();
		
		StringBuffer sba = new StringBuffer();
		StringBuffer sbb = new StringBuffer();
		
		for(int i = a.size()-1;i>=0;i--) {
			sba.append(a.get(i));
			sbb.append(b.get(i));
		}
		
		int numa = Integer.parseInt(sba.toString());
		int numb = Integer.parseInt(sbb.toString());
		int numr = numa + numb;
		String sr = String.valueOf(numr);
		String [] as = sr.split("");
		for (int i = as.length-1; i>=0;i--) {
			result.add(Integer.parseInt(as[i]));
		}
		
		return result;
	}
	public static void main(String[] args) {
		// 9:19 pm
		SumReverse sr = new SumReverse();
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		b.add(9);
		b.add(1);
		b.add(7);

		System.out.println(a);
		System.out.println(b);
		System.out.println(sr.calc(a,b));
		// 9:33 pm

	}

}
