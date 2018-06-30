package JavaClass;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by jeonghyonkim on 2017. 2. 21..
 */
public class List3 {
    String getEncryption (String str) {
        /* To Do : 비즈니스 로직 */
        String[] sa = str.split("");
        LinkedList<String> ls = new LinkedList<>(Arrays.asList(sa));

        // 왼쪽으로 두칸
        ls.addLast(ls.removeFirst());
        ls.addLast(ls.removeFirst());

        // 2번째, 4번째 자리 바꾸기
        ls.add(2-1, ls.remove(4-1));
        ls.add(4-1, ls.remove(2));

        // 오른쪽으로 세칸
        ls.addFirst(ls.removeLast());
        ls.addFirst(ls.removeLast());
        ls.addFirst(ls.removeLast());

        String result = "";
        for(String s : ls) {
            result +=s;
        }
        return result;
    }

    public static void main(String[] args) {
        List3 list3 = new List3();
        System.out.println(list3.getEncryption("123456"));
    }
}
