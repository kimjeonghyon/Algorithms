package JavaClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by jeonghyonkim on 2017. 2. 21..
 */
public class List1
{
    public String getSortedString(String str){

        String[]astr=str.split(" ");
        StringBuffer sb=new StringBuffer();
        Arrays.stream(astr).sorted(
                (o1,o2)->(Math.abs(Integer.parseInt(o1)) > Math.abs(Integer.parseInt(o2)))?1:-1
        ).forEach(s -> sb.append(s+" "));

        return sb.toString();
     }


    public static void main (String[] args) {
        String str = "-1 -2 4 3";
        List1 list1 = new List1();
        System.out.println(list1.getSortedString(str));
    }
}
