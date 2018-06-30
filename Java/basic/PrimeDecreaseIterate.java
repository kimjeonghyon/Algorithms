package Java200;

/**
 * Created by jeonghyonkim on 2017. 3. 5..
 */
public class PrimeDecreaseIterate {

    public static void main (String[] args) {
        int toInt = 30;
        for (int i = 2; i < toInt; i++) {
            printPrime(i, isPrime2(i));
        }
        for (int i = 2; i < toInt; i++) {
            printPrime(i, isPrime3(i));
        }

        System.out.println(isPrime3(10000873));
    }

    public static boolean isPrime2(int a) {
        boolean isP = true;
        int b = a/2;
        for (int i = 2;i <= b; i ++) {
            if(a%i==0) {
                isP =false;
                break;
            }
        }
        return isP;
    }

    public static boolean isPrime3(int a) {
        boolean isP = true;
        int b = (int) Math.sqrt(a);
        for (int i=2; i<=b; i++) {
            if(a%i==0) {
                isP=false;
                break;
            }
        }
        return isP;
    }

    public static void printPrime(int num, boolean isp) {
        if(isp) {
            System.out.println(num+"는 소수");
        }else {
            System.out.println(num + "는 소수가 아님");
        }
    }

}


