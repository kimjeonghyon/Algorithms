package problem7;

public class NumCount {

	int[] getValue (int stt, int end) {	
		
		int [] cnt = new int [10];
		
		for (int i = stt; i <= end; i ++) {
			String[] sa = String.valueOf(i).split("");
			count (sa, cnt);
		}
		return cnt;
	}
	void count(String[] sa, int[] cnt) {
		for (String s : sa) {
			cnt[Integer.valueOf(s)]++;
		}

	}
	public static void main(String[] args) {
		// 125에서 130까지 0~9까지 숫자 카운트
		NumCount nc = new NumCount();
		int[] cnt = nc.getValue(125, 126);
		for(int i : cnt) {
			System.out.println(i);
		}
	}

}
