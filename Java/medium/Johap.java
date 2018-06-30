package problem8;

public class Johap {

	void execute (int[] a, int p) {
		
		// nCr = n-1Cr-1 + n-1Cr 
		int [] na = new int[p];
		calc (a.length,  0, na, 0);
	}
	
	void calc (int n, int idx, int[] na, int target) {
	    if (idx == na.length) {
	    	print (na);
	    	return;
	    }
		else if(target == n) {
			return;
		} else {
			na[idx] = target;
			calc (n, idx+1,  na, target+1);
			calc (n, idx, na, target+1);
		}
	}
	void print(int[] na) {
		for(int i : na) {
			System.out.print(i);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// 3,4,5,6,7 중에서 3개를 뽑는 경우를 모두 리턴하시오.
		int[] a = {3,4,5,6,7};
		

		Johap j = new Johap();
		
		j.execute(a, 3);

	}

}
