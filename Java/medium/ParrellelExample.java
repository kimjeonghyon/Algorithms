package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by jeonghyonkim on 2017. 3. 15..
 */
public class ParrellelExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");

        Stream<String> stream = list.stream();
        stream.forEach(ParrellelExample :: print);

        System.out.println();

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParrellelExample :: print);
    }

    public static void print(String str) {
        System.out.println(str+ " : " + Thread.currentThread().getName());
    }
}
