package problem;

import java.util.Set;
import java.util.TreeSet;


public class ABC {

	Set<String> hs = new TreeSet<>();
	
	int getNumber (String str) {
		
		char[] chars = str.toCharArray();
		int [] nIdx = new int [chars.length];
		getIdx (chars, chars.length, nIdx, 0);
		
		int result = 1;
		for (String s : hs) {
			//System.out.println(s);
			if (s.equals("BALL")) { break;}
			result++;
		}
		return result;
	}
	
	void getIdx (char[] chars, int n, int[] nIdx, int idx) {
			
		if (idx == n) {
			//System.out.println(makeString(chars, nIdx));
			hs.add(makeString(chars, nIdx));
			
			return;
		}
		
		for (int i = 0 ; i < n; i ++ ) {
			if(!find(nIdx, idx, i)) {
				nIdx[idx] = i;
				getIdx (chars, n, nIdx, ++idx);
				idx--;
			}
		}
	}
	
	boolean find(int[] nIdx, int idx, int target) {
		for (int i = 0; i < idx; i ++) {
			if (nIdx[i] == target) {
				return true;
			}
		}
		return false;
	}
	
	String makeString(char[] ca, int[] ia) {
		int size = ca.length;
		
		StringBuffer sb = new StringBuffer();
		
		for (int i= 0; i < size; i ++) {
			sb.append(ca[ia[i]]);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// ABC 문자열 입력하면, 가능한 모든 경우의 수를 나열하고, ABC 순으로 정렬하
		// BAC 가 몇번째 인지 구하시오.
		//15:06
		String str  = "BALL";
		
		ABC abc = new ABC();
		
		System.out.println(abc.getNumber(str));
		
		//18:50
	}

}
