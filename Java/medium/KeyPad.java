package problem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyPad {

	String keyPad (String str) {
		Map<String,String> hm = new HashMap<>();
		hm.put("A","11");
		hm.put("B","22");
		hm.put("C","33");
		
		String [] as = str.split("");
		StringBuffer sb = new StringBuffer();
		for(String s : as) {
			 sb.append(hm.get(s));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
	    // 9:40 pm
		// 핸드폰 키패드 1 (ABC), 2 (DEF) 3 ...   * 0 #
		// 1BFsS  ==> 1#1112222*77#77
		
		KeyPad kp = new KeyPad();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("핸드폰으로 입력하려고 하는 문자열은?");
		System.out.println("입력 > ");
		
		if(sc.hasNext()) {
			System.out.println(kp.keyPad(sc.nextLine()));
		}
		
		// 9:46
	}

}
