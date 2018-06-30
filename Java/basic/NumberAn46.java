package Java200;

/**
 * Created by jeonghyonkim on 2017. 2. 13..

 규칙이 있는 수의 합 구하기
 1.0, 1.0/2!, 1.0/3!, 1.0/4!, 1.0/5!
 */

public class NumberAn46 {

    public static void main(String[] argc) {
        System.out.println(fact(3));

        double sum = 0.0;

        for (int i = 1; i < 10; i ++) {
           sum += 1.0 / fact(i);
        }

        System.out.println ("Sum : " + Math.round(sum*100.0)/100.0);
    }

    static int  fact(int n) {
        int result = 1;

        for (int i=n;i>0;i--) {
            result *=i;
        }

        return result;
    }
}
