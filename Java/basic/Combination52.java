package Java200;

/**
 * Created by jeonghyonkim on 2017. 3. 2..
 */
public class Combination52 {
    public static void main(String[] args) {

        int count = 0;
        for (int i=1;i<6;i++) {
            for (int j=1;j<6;j++) {
                for (int k=1;k<6;k++) {
                    if((i<j) && (j<k) && (i<k)) {
                        count++;
                        System.out.println(i+ " " + j + " " + k);
                    }
                    //System.out.println(i+ " " + j + " " + k);
                }
            }
        }

        System.out.println("5C3=" + count);
    }
}

/*
  if 문에 무얼 넣느냐에 따라 다르다
  피타고라스 정리는 a*a = b*b + c*c
  페르마 정리 a*a*a = b*b*b + c*c*c
  추 문제는 2*i + 3*j + 5*k = 81
  조합은 i<j && j <k && i<k
  순열은 n!=j && j!=k && n!=k
 */