package Java200;

import java.util.HashSet;

/**
 * Created by jeonghyonkim on 2017. 3. 5..
 */
public class SetIterTest1 {
    public static void main (String[] args) {
        HashSet list = new HashSet();
        list.add("lee");
        list.clear();
        list.add("cho");
        list.add("kim");
        list.add("chung");
        list.add("chung");
        System.out.println(list.size());
        System.out.println(list.contains("chung"));
        list.remove("kim");
        System.out.println(list.size());

        for(Object item : list) {
            System.out.println((String)item);
        }
    }
}
