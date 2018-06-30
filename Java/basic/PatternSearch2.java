package JavaClass;

/**
 * Created by jeonghyonkim on 2017. 1. 10..
 */
public class PatternSearch2 {

    int patCount(String str, String p) {
        int idx = 0;
        int cnt = 0;
        while(true) {
            int found = str.indexOf(p, idx);
            if(found >=0) {cnt ++; idx = found+1;}
            else break;
        }
        return cnt;
    }
    public static void main(String[] args) {
        String str = "GGOLLOLOLGOLLLB";
        String p = "LL";
        PatternSearch2 pc = new PatternSearch2();
        System.out.println(pc.patCount(str, p));
    }
}
