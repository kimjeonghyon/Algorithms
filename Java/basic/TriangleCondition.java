package Java200;

/**
 * Created by jeonghyonkim on 2017. 3. 5..
 */
public class TriangleCondition {
    public static void main(String[] args) {
        for(int z=1;z<5;z++) {
            for(int y=1;y<5;y++) {
                for(int x=1;x<5;x++) {
                    if( (x+y > z) && (y+z > x) && (x+z > y)) {
                        System.out.println("삼각형 조건 : x=" + x + "y=" + y+"z="+z);
                    }
                }
            }
        }
//        printTriCons(5);
//        printTriConUp(5);
    }
}
