package JavaClass;

/**
 * Created by jeonghyonkim on 2017. 1. 10..
 */
public class PatternSearch1 {
    boolean validate(String a, String b) {
        /* To Do : 비즈니스 로직 */
        boolean isCircle = false;

        for (int i = 0; i < b.length(); i ++) {
            if(a.equals(b.substring(i)+b.substring(0, i))) {
                isCircle = true;
                break;
            }
        }
        return isCircle;
    }
    public static void main(String[] args) {
        String a =  new String("abcdaf");
        String b =  new String("dafabc");

        PatternSearch1 cs = new PatternSearch1();
        System.out.println(cs.validate(a, b));
    }
}
