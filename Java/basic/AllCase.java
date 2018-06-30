package aaa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllCase {

	List<Object[]> llIdx = new ArrayList<>();
	
	List<String> getCases(String[] astr) {
	
	   findIdxString(10, new ArrayList<Integer>());
	   
	   for (Object[] li : llIdx) {
		   for (Object o : li)
			   System.out.print((Integer)o );
		   System.out.println();
	   }
	   return new ArrayList<String> ();
	}
	
	void findIdxString(int len, ArrayList<Integer> lIdx) {
		for (int i = 0; i< len; i ++) {
			if(lIdx.size() > 1) {
				Set<Integer> st = new HashSet<>();
				for(int idx : lIdx) st.add(idx);
				if(st.size() < lIdx.size()) {
					break;
				}
			}
			lIdx.add(i);
			if (lIdx.size() == len) {
				
				Set<Integer> st = new HashSet<>();
				for(int idx : lIdx) st.add(idx);
				if(st.size() == len) {
					llIdx.add(lIdx.toArray());
					//System.out.println(lIdx);
				}
				lIdx.remove(lIdx.size()-1);
			}
			else {
				findIdxString(len, lIdx);
				lIdx.remove(lIdx.size()-1);
			}
		}
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] astr = {"A","B","C"};
		
		AllCase ac = new AllCase();
		System.out.println(ac.getCases(astr));
	}

}
