package test;

/**
 * Created by jeonghyonkim on 2017. 3. 10..
 */
public class StringTest {

    public static void main(String[] args) {
        String str = "LG";
        SomeClass.change(str);
        SomeClass.change2(str);
        System.out.println(str + SomeClass.str);
    }
}


class SomeClass {
    public static String str = "LG";

    public static void change(String str) {
        SomeClass.str += "BEST";
    }

    public static void change2(String str) {
        str += "ONLY ONE";
    }
}
