package problem7;

import java.util.ArrayList;
import java.util.List;

public class RepeatCnt {

	String getValue (String str) {
		
		List<String> ls = new ArrayList<>();
	    String[] sa = str.split("");
	    StringBuffer sb = new StringBuffer();
	    
	    for (int i = 0; i < sa.length; i++) {
	    	String s = sa[i];
	    	if (i == 0) {
	    		sb.append(s);
	    	}
	    	else {
	    		if (s.equals(sb.substring(sb.length()-1))) {
	    			sb.append(s);
					if (i == sa.length-1) ls.add(sb.toString());
	    		} else {
	    			ls.add(sb.toString());
	    			sb = null;
	    			sb = new StringBuffer(s);
	    		}
 	    	}
	    }

	    StringBuffer sb2 = new StringBuffer();
	    for (String s2 : ls) {
	    	sb2.append(s2.charAt(0));
	    	sb2.append(s2.length());
	    }

	  return sb2.toString();
	}
	
	public static void main(String[] args) {
		// aabcccccaaa, zzdffffffs -> a2b1c5a3, z2d1f6s1
		
		String str = "aabcccccaaa";
		RepeatCnt rc = new RepeatCnt();
		System.out.println(rc.getValue(str));
	}

}
