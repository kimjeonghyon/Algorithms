package aaa;
import java.util.*;

class Caesar {
	String caesar(String s, int n) {
		String result = "";
		// 함수를 완성하세요.
    char[] ac = s.toCharArray();
    StringBuffer sb = new StringBuffer();
    System.out.println((char)('E'+22-26)); //E = 69
    for (char c : ac) {
      if (c>='a' && c<='w') {c+=4;}
      else if (c>='A' && c<='W') {c+=4;}
      else if (c>='x' && c<='z') {c=(char) (c-'a'+4);}
      else if (c>='X' && c<='Z') {c=(char) (c-'A'+4);}
      sb.append(c);
    }

		return sb.toString();
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
		// c,d,e,f,g
		//ceGWlE SMLZCdewcOjK PM mf OfYOhlfCZxHKzzZNlYi z
		//aCShA OIHVYza]syKfG LI ib KbUKdhbY
		//{CSh[ OIHVYz{]syKfG LI ib KbUKdhbY
	}
}

