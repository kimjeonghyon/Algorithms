package Java200;

/**
 * Created by jeonghyonkim on 2017. 3. 2..
 */
public class IfLeapYears {

    public static void main(String[] args) {
        boolean yearTF=false;
        int year=2100;
        if((0== (year %4) && 0!=(year%100)) ||
            0 == year%400) {
            yearTF = true;
        }else{
            yearTF = false;
        }

        if(yearTF) {

            System.out.println(year + "는 윤년입니다.");
        } else {
            System.out.println(year + "는 윤년이 아닙니다.");
        }


    }
}
