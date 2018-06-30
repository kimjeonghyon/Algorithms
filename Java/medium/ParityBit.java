package problem4;

import java.util.ArrayList;
import java.util.List;

public class ParityBit {

	String checkParity(int [][] a) {
		
		List<Integer> arow = new ArrayList<>();
		List<Integer> acol = new ArrayList<>();
		
		for (int[] ar : a) {
			int sum = 0;
			for (int i : ar) {
				sum +=i;
			}
			arow.add(sum);
		}
	

		for (int i = 0; i < a[0].length; i ++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				sum += a[j][i];
			}
			acol.add(sum);
		}
		
		int rodd = 0;
		int ridx = 0;
		for (int i = 0; i < arow.size(); i ++ ) {
			int row = arow.get(i);
			if (row%2!=0) {rodd++;ridx=i;}
			System.out.println(row);
		}
		
		int codd = 0;
		int cidx = 0;
		for (int i = 0; i < acol.size(); i ++) {
			int col = acol.get(i);
			if (col%2!=0) {codd++;cidx=i;}
			System.out.println(col);
		}
		
		System.out.println("rodd:" + rodd + " codd : " + codd);
		String result;
		if (rodd + codd == 0) {
			result = "OK";
		} else if (rodd == 1 && codd == 1) {
			result = "("+ridx+","+cidx+")";
		} else {
			result = "FAIL";
		}
		return result;
	}
	public static void main(String[] args) {

		// 문제 : 가로 세로 각 합이 모두 짝수이면, OK
		// 홀수가 있면, Fail
		// 1개만 바꿔서 OK가 되면, 좌표 리턴.
		int[][] a = {
				{0,1,0,1},
				{1,1,1,1},
				{1,1,1,1},
				{0,1,0,1}
		};
		
		ParityBit p = new ParityBit();
		System.out.println(p.checkParity(a));
		
	}

}
