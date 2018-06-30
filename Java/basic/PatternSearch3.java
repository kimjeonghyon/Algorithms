package JavaClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeonghyonkim on 2017. 1. 10..
 */
public class PatternSearch3 {
    String getValue (String str) {
        /* To Do : 비즈니스 로직 */
        List<String> ls = new ArrayList<>();
        int beginIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((i > 0 && str.charAt(i) != str.charAt(i-1))) {
                ls.add(str.substring(beginIndex, i));
                beginIndex = i;
            }
            if (i == str.length()-1) ls.add(str.substring(beginIndex));
        }
        StringBuffer sb = new StringBuffer();
        for (String s : ls) {
            sb.append(s.charAt(0)).append(s.length());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // aabcccccaaa, zzdffffffs -> a2b1c5a3, z2d1f6s1
        String str = "aabcccccaaa";
        PatternSearch3 ps = new PatternSearch3();
        System.out.println(ps.getValue(str));
    }
}
