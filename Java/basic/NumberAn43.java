package Java200;

/**
 * Created by jeonghyonkim on 2017. 2. 13..
 */
public class NumberAn43 {
    public static void main (String[] argc) {
        int start = 1;
        int end = 9;
        int increment = 2;

        int sum = 0;
        for (int i = start;i<=end; i = i + increment) {
            sum +=i;
        }

        System.out.println("Sum :" + sum);
    }
}
