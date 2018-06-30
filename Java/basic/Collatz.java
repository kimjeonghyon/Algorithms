package aaa;

class Collatz {
	public int collatz(int num) {
		int answer = 0;
		long lnum = num;
    while (lnum > 1) {
      if (answer >= 500) {answer = -1; break; } 
      if (lnum%2==0) { lnum = lnum/2; }
      else { lnum = lnum*3+1; }
      answer++;
      System.out.println(lnum);
    }
		return answer;
	}
// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 1256699;
		System.out.println(c.collatz(ex));
	}
}
