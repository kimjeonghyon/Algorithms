package test;

/**
 * Created by jeonghyonkim on 2017. 3. 15..
 */
public class Student {
    private String name;
    private int score;

    public Student (String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
}
