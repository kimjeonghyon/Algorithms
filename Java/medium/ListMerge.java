package problem10;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by jeonghyonkim on 2017. 3. 10..
 */
public class ListMerge {
    public static void main (String[] args) {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        ArrayList<Integer> listB = new ArrayList<Integer>();
        for (int inx=0; inx < 10; inx++) {
            listA.add(inx);
        }
        for (int inx=30; inx > 15; inx--) {
            listB.add(inx);
        }
        ListMerge merger = new ListMerge();
        ArrayList<Integer> listC = merger.merge(listA, listB);
        int count = 0;
        for (Integer inx : listA) {
            System.out.println("listA[" + count + "] =" + inx);
            count ++;
        }
        count = 0;
        for (Integer inx : listB) {
            System.out.println("listB[" + count + "] =" + inx);
            count ++;
        }
        count = 0;
        for (Integer inx : listC) {
            System.out.println("listC[" + count + "] = " + inx);
            count ++;
        }
    }

    public ArrayList<Integer> merge (ArrayList<Integer> listA, ArrayList<Integer> listB) {
        ArrayList<Integer> listC = new ArrayList<Integer>();
        TreeMap<Integer, Object> map = new TreeMap<Integer, Object>();

        for (Integer inx : listA) {
            map.put(inx, inx);
        }

        for (Integer inx : listB) {
            map.put(inx, inx);
        }

        Set<Integer> set = map.keySet();
        for (Integer inx : set) {
            listC.add(inx);
        }

        return listC;
    }
}
