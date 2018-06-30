package test;

import java.util.ArrayList;

public class SortString {

	ArrayList<String> arrStr = new ArrayList<>();
	ArrayList<String> arrRet = new ArrayList<>();

	
    public String getSortedString(String str) {

    	String[] spd = str.split(" ");
    	
    	for (int i = 0; i < spd.length; i++) {
    		arrStr.add(spd[i]);
    	}
    	
    	for (int i=0;i<spd.length;i++) {
    		findMin();
    	}


    	return makeRet();
    }
    
    private String makeRet() {
    	String ret = arrRet.get(0) + " " + arrRet.get(arrRet.size()-1);
    	return ret;
    }
    private void findMin() {
       	int minIdx = 0;
    	for (int i = 1; i < arrStr.size(); i++) {
    		if ( Integer.parseInt(arrStr.get(i)) < Integer.parseInt(arrStr.get(minIdx))){
    			minIdx = i;
    		}
    		
    		System.out.println("i :" + i + "  v(i) :" + arrStr.get(i) + "  v(i-1) : " + arrStr.get(i-1) + " minIdx :" + minIdx);
    	}
       		
       	arrRet.add(arrStr.get(minIdx));
       	
       	arrStr.remove(minIdx);
    }
	
	public static void main(String[] args) {
	
		String str = "-1 -2 4 3";
		
		SortString sortString = new SortString();
		
		System.out.println("sorted : " + sortString.getSortedString(str));
	}

}
