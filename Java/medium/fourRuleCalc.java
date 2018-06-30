package problem2;

import java.security.AllPermission;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class fourRuleCalc {

    
	String getResult(String str) {
		Map<String, Integer> priority = new HashMap<>();
		priority.put("(", 0);
		priority.put(")", 0);
		priority.put("+", 1);
		priority.put("-", 1);
		priority.put("*", 2);
		priority.put("/", 2);

		str = str.replaceAll("\\p{Space}", "");
		
		System.out.println(str);
	    
		// String split to ArrayList
		String[] operands = str.split("-|\\(|\\)|\\*|/|\\+");
		
		String[] operators = str.split("\\.|[0-9]");
		// operator 정련
		Deque<Character> qoperators = new ArrayDeque<>();
		
		for (String s : operators) {
			if(!s.isEmpty()) {
				char[] ca = new char[s.length()];
				s.getChars(0, s.length(), ca, 0);
				
				for (char c : ca) {
					qoperators.add(c);
				}
			}
				
		}
		
		List<String> strArrays = new ArrayList<>();
		for (String s : operands) {
			if(s.isEmpty()) {
				strArrays.add(qoperators.remove().toString());
			} else {
				strArrays.add(s);
				if(!qoperators.isEmpty())
					strArrays.add(qoperators.remove().toString());
			}
		}
		
		// operator
		Set<String> so = priority.keySet();
		
		
		 /*
		중위표현식을 후위표현식으로 전환하기
		1. 입력받은 중위 표기식에서 토큰을 읽는다. 
		2. 토큰이 피연산자이면 토큰을 결과에 출력한다. 
		3. 토큰이 연산자인경우, 스택의 연산자가 토큰보다 우선순위가 높으면 pop하여 결과에 출력한다. 
		   아니면, 중단
		   토큰을 스택에 삽입
		4. 토큰이 ')'이면, 스택에 '('가 나올때까지 pop하고 결과에 출력, '('는 버린다. 
		5. 더 읽을 것이 없다면 빠져나간다. 
		6. 스택의 남은 정보를 출력한다.
		*/

		// 후위식
		List<String> sList = new ArrayList<>();
		
		// 스택
	    Deque<String> stack = new ArrayDeque<>();
	    

		String spop = "";
		for (String s : strArrays) {
			if ( !so.contains(s)) {
				sList.add(s);
			} else {
				// operator
				switch (s) {
				case "(":
					stack.push(s);
					break;
				case ")":
					while(!stack.isEmpty() && !((spop = stack.pop()).equals("("))) {
						sList.add(spop);
					}
					break;
				default:
					int prior = priority.get(s);
					while(!stack.isEmpty() && priority.get(stack.peek()) > prior) {
						sList.add(stack.pop());
					}
					stack.push(s);
					
					break;
				}
			}
		}

		while (!stack.isEmpty()) {
			sList.add(stack.pop());
		}


		System.out.println(sList);
		
		// 계산
		Deque<String> tempStack = new ArrayDeque<>();
		
		
		for (String item : sList) {
			if(!priority.containsKey(item)) {
				tempStack.push(item);
			} else {
				double b = Double.parseDouble(tempStack.pop());
				double a = Double.parseDouble(tempStack.pop());
				
				switch (item) {
				case "+":
					tempStack.push(String.valueOf(a+b));			
					break;
				case "-":
					tempStack.push(String.valueOf(a-b));			
					break;
				case "*":
					tempStack.push(String.valueOf(a*b));			
					break;
				case "/":
					tempStack.push(String.valueOf(a/b));			
					break;
				}
				System.out.println(tempStack.peek());
			}
		}
		
		return tempStack.pop();
	}
	public static void main(String[] args) {
		// 임의의 수식 스트링을 받아 결과를 리턴하시오.
		
		String str = "56465734324534536545e*545464657/5676(54545654+645654)";
		
		fourRuleCalc fr = new fourRuleCalc();
		
		System.out.println(fr.getResult(str));
		
	}

}
