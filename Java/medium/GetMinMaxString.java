package test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GetMinMaxString {

	public String getMinMaxString(String str) {
		
		String [] arr = str.split(" ");
		
		int min = 0;
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
		
			if (i==0) {
				min = max = Integer.parseInt(arr[0]);	
			} 
			
			if (Integer.parseInt(arr[i]) > max) {
				max = Integer.parseInt(arr[i]);
			}
			
			if (Integer.parseInt(arr[i]) < min) {
				min = Integer.parseInt(arr[i]);
			}
			
		}
		
        return max + " " + min;
    }

    public static void main(String[] args) {
        String str = "10 2 3 4 5 8 1";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }

}
