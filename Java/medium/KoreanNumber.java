package test;

import java.util.StringTokenizer;

public class KoreanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "삼십만삼천백십오"; 

		System.out.println(input); 
		System.out.println(hangulToNum(input)); 
	}

	public static long hangulToNum (String input) {
		
		final String NUMBER ="영일이삼사오육칠팔구"; 
		final String UNIT = "십백천만억조"; 
		final long[] UNIT_NUM = { 10, 100, 1000, 10000, (long)Math.pow(10, 8),(long)Math.pow(10, 12)}; 

		StringTokenizer st = new StringTokenizer(input, UNIT, true); 

		while (st.hasMoreTokens()) {
			String token =  st.nextToken();
			System.out.println(token);
		}
		return 0;
	}
}
