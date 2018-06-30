package aaa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;

public class KeySearch {

	public static void main(String[] args) {
		
		HashMap<String, String> ht = new HashMap<>();
		
		ht.put("B","22");
		ht.put("A","33");
		ht.put("C","11");
		
		String a = "BAC";
		
		String[] aa = a.split("");
		
		String result = "";
		for (String s : aa) {
			result += ht.get(s);
		}
		System.out.println(result);
		
		
	}
}