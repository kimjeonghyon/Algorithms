package JavaClass;

import java.util.*;

/**
 * Created by jeonghyonkim on 2017. 2. 21..
 */
class Student {
    String id; String name; String region;
    Student(String id, String name,  String region) {
        this.id = id; this.name = name; this.region = region;
    }
    @Override
    public String toString() {
        return id + "\t" + name + "\t" + region + "\n";
    }
}
public class List2 {
    public static void main(String[] args) {
        List<Student> studlist = Arrays.asList(
                new Student("1726", "John", "New York"),
                new Student("4321", "Max", "California"),
                new Student("2234", "Andrew",  "Los Angeles"),
                new Student("5223", "Michael", "New York"),
                new Student("7765", "Sam",  "California"),
                new Student("3442", "Mark", "New York")
        );

        System.out.println(studlist);
        System.out.println("----------------------------------");
        /* To Do : 정렬 (region + id) asc) */
        Collections.sort(studlist, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.region + o1.id).compareToIgnoreCase(o2.region + o2.id);
            }
        });
        System.out.println(studlist);
        System.out.println("----------------------------------");


        // java8 stream으로 하면..
        studlist.stream()
                .sorted((a,b) -> {
                    Student o1 = (Student)a;
                    Student o2 = (Student)b;
                    return (o1.region + o1.id).compareToIgnoreCase(o2.region + o2.id);
                    })
                .forEach(s->System.out.print(s));


    }
}

