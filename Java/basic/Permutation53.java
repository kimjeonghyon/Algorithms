package Java200;

/**
 * Created by jeonghyonkim on 2017. 3. 2..
 */
public class Permutation53 {
    public static void main(String[] args) {

        int permuCount = getPermuteCount(5);
        System.out.println("5P3="+ permuCount);

    }


    public static int getPermuteCount(int m) {
        int count=0;
        for (int i=1;i<=m;i++) {
            for(int j=1;j<=m;j++){
                for(int k=1;k<=m;k++) {
                    if((i!=j) && (j!=k) && (i!=k)) {
                        count++;
                        System.out.print("[" + i+ "," + j + "," + k+ "]");

                        if((count %5) == 0) {
                            System.out.println();
                        }
                    }
                }
            }
        }

        return count;
    }
}
