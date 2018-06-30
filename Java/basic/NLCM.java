class NLCM {
	
	public long nlcm(int[] num) {
		
		long lcalc = 0;
		
		lcalc = calc2 (num[0], num[1]);
		
		for (int i =1; i< num.length; i++) {
			lcalc = calc2 (lcalc , num[i]);
		}
		
		return lcalc;
	}
	
	
	private long calc2 (long a, int b) {
		
	    long max = (a>b)?a:b;
	    long min = (a>b)?b:a;
	  		
 		// 최대 공약수 찾기
 		int maxCommonNumber = 1;
 		
		boolean commonYn = true;
		for (int j = 1; j <= max; j++) {
			commonYn = true;
			
 		    if (a % j !=0) 
 				commonYn = false;
 			if (b % j !=0)	
 				commonYn = false;
 	
 			if (commonYn) {
	 				maxCommonNumber = j;
	 		}
	 	}
	 	
 		//System.out.println("max common number :" + maxCommonNumber);
 		
		
		// 최소 공배수 구하기
	    	long answer = maxCommonNumber * (long)a/maxCommonNumber* (long)b/maxCommonNumber;
	    //System.out.println("MCN:" + maxCommonNumber + " a:" + a + ", b:" + b + ", annswer : " + answer);

	    return answer;
	}

  
	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = {23, 18, 67, 85, 61, 49, 50, 50, 82, 28};
		
		// 2889374537700
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.nlcm(ex));
	}
}