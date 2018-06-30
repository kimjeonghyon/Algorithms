package problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Anagram {

	void getAna (String[] astr) {
		Map<String, List<String>> hm = new HashMap<>();
		
		for (String str : astr) {
			String key = makeAna(str);
			List<String> value;
			if (hm.containsKey(key)) {
				value = hm.get(key);
				value.add(str);
			} else {
				value = new ArrayList<>();
				value.add(str);
				hm.put(key, value);
			}	
		}
		
		Set<String> key = hm.keySet();
		
		for(String s : key) {
			List<String> value = hm.get(s);
			System.out.println(value);
		}
	}
	
	String makeAna(String str) {
		
		char [] ac = str.toLowerCase().toCharArray();
		Arrays.sort(ac);
		String ss = new String(ac);
		
		return ss;
	}
	
	public static void main(String[] args) {
//		Anagram 문제는 주어진 문자열 s1과 s2가 있을 때, 
//		s1의 원소들의 자리를 바꾸었을 때 s2와 같은지를 체크하는 문제이다. 
//      input은 pans, pots, opt, snap, stop, tops이다.
//		output은 opt / pots, stop, tops / pans, snap 이다.
		
		//09:28
		
		Anagram ana = new Anagram();
		
		String[] pr = {"pans","pots", "opt", "snap", "stop", "tops"};
		
		ana.getAna(pr);
		
		// 10:50
				
	}

}
