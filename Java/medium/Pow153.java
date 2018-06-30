package problem;

public class Pow153 {

	int get153() {
		
		int cnt = 0;
		for (int i = 1; i <= 1000; i ++) {
			if(calc (i)) cnt ++;
		}
		return cnt;
	}
	boolean calc (int n) {
		String s = String.valueOf(n);
		
		String[] sa = s.split("");
		int sum = 0;
		for (String str : sa) {
			int a = Integer.valueOf(str);
			sum += a*a*a;
		}
		
		return sum == n?true:false;
	}
	public static void main(String[] args) {
		// 153의 각 자리수를 제곱한 수를 더하면 153이다. 
		// 1부터 1000까지 이런 숫자가 몇개있는 구해보아라.
		
		// 10:05 
		
		Pow153 pow153 = new Pow153();
		
		System.out.println(pow153.get153());

	}

}
