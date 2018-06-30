package JavaClass;

import java.util.LinkedList;

/**
 * Created by jeonghyonkim on 2017. 4. 18..
 */
public class Stack2 {
    private int Calculate(String str) {
        int result = 0;
        /* To Do : logic 작성 */
        final String OPEN = "([{";
        final String CLOSE = ")]}";
        final int [] DIGIT = {2,3,4};

        LinkedList<String> stack = new LinkedList<>();

        String[] astr = str.split("");
        for(String e : astr) {
            int oIdx = OPEN.indexOf(e);
            int cIdx = CLOSE.indexOf(e);
            if(oIdx>0) {
                stack.addLast(e);
                
            }
            else if (cIdx >0) {
                if(stack.getLast().equals(OPEN.substring(cIdx,cIdx+1))) {stack.removeLast();}
                else {result = false; break;}
            }
        }

        return result;
    }
    public static void main(String[] args) {
        //{} 4, [] 3, () 2  
        // 감싸면 곱하기, 병렬연결은 더하기 
        // (()[[]])([]){[]}  == 2 * (2 + 3*3) + 2*3 + 4*3 = 40
        Stack2 stk = new Stack2();
        String str = "(()[[]])([]){[]}";
        System.out.println(stk.Calculate(str));
    }
}
