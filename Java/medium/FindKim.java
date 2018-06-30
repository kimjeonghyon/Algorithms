package test;

public class FindKim {
	public String findKim(String[] seoul){
		//x에 김서방의 위치를 저장하세요.
		int x = 0;
	
    for (int i = 0; i< seoul.length; i++) {
      if("Kim".equals(seoul[i])) {
        x = i+1;
        System.out.println("found");
      }
      System.out.println(seoul[i]);
    }
		
		return "김서방은 "+ "\n" + x + "에 있다";
	}
	
	// 실행을 위한 테스트코드입니다.
	public static void main(String[] args) {
		FindKim kim = new FindKim();
		String[] names = {"Kim","Hue", "Ban","Park"};
		System.out.println(kim.findKim(names));
		
		System.out.println("\n".length());
	}
}


