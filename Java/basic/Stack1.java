package JavaClass;

import java.util.LinkedList;

/**
 * Created by jeonghyonkim on 2017. 4. 14..
 */
public class Stack1 {
    private boolean isClosed(String str) {
        boolean result = true;
        /* To Do : logic 작성 */
        final String OPEN = "([{";
        final String CLOSE = ")]}";

        LinkedList<String> stack = new LinkedList<>();

        String[] astr = str.split("");
        for(String e : astr) {
            int oIdx = OPEN.indexOf(e);
            int cIdx = CLOSE.indexOf(e);

            if(oIdx>0) stack.addLast(e);
            else if (cIdx >0) {
                if(stack.getLast().equals(OPEN.substring(cIdx,cIdx+1))) {stack.removeLast();}
                else {result = false; break;}
            }
        }

        if(stack.size() > 0) result = false;

        return result;
    }
    public static void main(String[] args) {
        String str = " [Hello(ffff+1)+ [fffff] 00000]"; // true
        //String str = "(kdjfkdjfkd)[(dkfjdkjf){fdkjf]}";  // false;

        Stack1 stk = new Stack1();
        System.out.println(stk.isClosed(str));
    }
}
