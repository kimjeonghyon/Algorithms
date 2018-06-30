package problem6;

public class Hangrul {

	void execute (int row, int col, String str) {
		// 배열의 크기 r *c
		// 입력값 생성 : r*c 자리로 바로, 거꾸로 반복 문자열 만들기 
		// 
	}
	
	public static void main(String[] args) {
		//    가로 한번 , 세로 한번
		//    ABCD
		//    EDCB
		//    ABCD
		//
		//    ADCB
		//    BEBC
		//    CDAD
		
	    int row = 4;
	    int col = 3;
	    int num = 5;
	    // 'A' - 65
	    // 'B' - 66
	    // 'Z' - 65 + 25
	    StringBuffer sb = new StringBuffer();
	    for(int i = 65; i < 'A'+num; i++ ) {
	    	sb.append((char)i);
	    }
	    Hangrul hr = new Hangrul();
	    
	    hr.execute(row, col, sb.toString());
	    
	    // 1:30
	}

}
