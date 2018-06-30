package problem5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CaseCount {
	
	Set<String> getNum (String str) {
		Set<String> hs = new HashSet<>();
		         
		int [] nia = new int [str.length()];
		calc (str.toCharArray(), str.length(), nia, 0, hs);
		
		
		return hs; 
	}
	
	void calc (char[] ca, int idx, int[] nia, int nidx, Set<String> ls ) {
		if (nidx == idx) {
			if(!isDup(nia)) {
				ls.add(makeString(ca, nia));
			}
			return;
		}
		for (int i = 0; i < idx; i++) {
			nia[nidx] = i;
			calc (ca, idx, nia, ++nidx, ls);
			nidx--;
		}
	}

	boolean isDup(int[] ia) {
		Set<String> s = new HashSet<String>();
		for (int i : ia) {
			s.add(String.valueOf(i));
		}
		return ia.length == s.size()?false:true;
	}
	
	String makeString(char[] ca, int[] ia) {
		StringBuffer sb = new StringBuffer();
		for (int i : ia) {
			sb.append(ca[i]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// 문제 : 
		// 1. 주어진 문자열의 순서를 바꿔서 나올 수 있는 모든 문자열의 경우를 
		// Set에 담아 리턴하시요.
		// 2. Set에 담긴 문자열등을 알파벳 순으로 정렬했을 때 주어진 문자열이 
		// 몇번째 문자열인지 리턴하시요.
		
		String s ="BALL";
		CaseCount cc = new CaseCount();
		Set<String> set = cc.getNum(s);
		
		TreeSet<String> ts = new TreeSet<>(set);
		
		int idx = 0;
		for (String tss : ts) {
			System.out.println(tss);
			if (tss.equals(s)) break;
			idx ++;
		}
		
		System.out.println("idx : " + idx);
		//12:57, 14:40
		//15:30
	}

}
