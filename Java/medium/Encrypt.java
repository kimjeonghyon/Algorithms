package problem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Encrypt {

	String getEncryption (String str) {
		String[] sa = str.split("");
		LinkedList<String> ls = new LinkedList<>(Arrays.asList(sa));
		
		goLeft(ls);
		goLeft(ls);
		

		change(ls, 2,4);
		
		goRight(ls);
		goRight(ls);
		goRight(ls);
		
		String result = "";
		for(String s : ls) {
			result +=s;
		}
		return result;
	}
	
	void goLeft(LinkedList<String> ls) {
		ls.offer(ls.poll());
	}
	
	void goRight(LinkedList<String> ls) {
		ls.addFirst(ls.removeLast());
	}
	
	void change(LinkedList<String> ls, int pos1, int pos2) {
		ls.add(pos1-1, ls.remove(pos2-1));
		ls.add(pos2-1, ls.remove(pos1));
	}
	
	public static void main(String[] args) {
		// 왼쪽으로 두번, 2번째 4번째 값 바꾸기, 오른쪽으로 3번
		// 19:00
		Encrypt enc = new Encrypt();
		
		System.out.println(enc.getEncryption("123456"));
		// 19:20
	}

}
