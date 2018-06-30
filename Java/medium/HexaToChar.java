package problem7;

public class HexaToChar {

	String getValue(String str) {
		StringBuffer sb = new StringBuffer();
		
		int i = 0;
		while (i<str.length()) {
			if ('%' == str.charAt(i)) {
				int num = Integer.parseInt(str.substring(i+1, i+3), 16);
				sb.append((char)num);
				i += 2;
			} else {
				sb.append(str.charAt(i));
			}
			i++;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// H%6Ft%3F -> Hot?
		// %는 다음에 16진수가 오며, 이 값에 해당하는 아스키 값으로 변환하라. 
		String str = "H%6Ft%3F"; 
	    HexaToChar htc  = new HexaToChar();
	    System.out.println(htc.getValue(str));
	}

}
