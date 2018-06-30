package problem10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by jeonghyonkim on 2017. 3. 10..
 */
public class NumberSort {

    public static void main (String [] args) {
        int [] inNums = { 4,3,10,6,7 };
        System.out.println("입력 >>>>>");
        printArray(inNums);

        int[] sortedNums = sortIntNumbers (inNums );

        // int [] sortedNums = bubblessort (inNums);

        System.out.println("정렬결과 >>>>");
        printArray(sortedNums);
    }

    private static int[] sortIntNumbers(int[] inNums) {
        List<Integer> wlist = new ArrayList<>();

        //for (int i = 0; i < inNums.length; i++) {
        // wlist.add(inNums[i]);
        //}
        for (int x : inNums) {
            wlist.add(x);
        }
        Collections.sort(wlist);
        int [] result = new int[wlist.size()];

        for (int i = 0; i < wlist.size(); i ++) {
            result[i] = (int) wlist.get(i);
        }
        return result;
    }

    private static void printArray(int [] inNums) {
        for (int i = 0; i < inNums.length; i ++) {
            System.out.println(inNums[i]);
        }
    }

    private static int[] bubbleSort(int[] inNums) {
        int [] result = Arrays.copyOf(inNums, inNums.length);
        int minVal = -1;
        int tempVal = 0;

        for (int i = 0; i < result.length; i ++) {
            minVal = result[i];

            for (int j = i ; j < result.length; j ++) {
                if (result[j] < minVal) {
                    tempVal = minVal;
                    minVal = result[j];
                    result[j] = tempVal;
                }
            }
            result[i] = minVal;
        }
        return result;
    }
}
