package test;

public class PrintTriangle {
	public String printTriangle(int num){
    String newLine = "\n";
    String star = "*";
    
    StringBuffer stars = new StringBuffer();
    
    for (int i = 0; i < num; i++) {
      for (int j=0; j <= i; j++) {
        stars.append(star);
      }
      stars.append(newLine);
    }
		return stars.toString();		
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(5) );
	}
}