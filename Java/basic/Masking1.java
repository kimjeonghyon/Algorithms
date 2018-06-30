package JavaClass;

public class Masking1 {
    private String getName(String name) throws Exception {
        /* To Do : 비즈니스 로직 */
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < name.length(); i ++) {
            if ('가' > name.charAt(i) || '힣'< name.charAt(i)) {
                throw new Exception("이름: 한글이 아닙니다");
            }
            if (i==0 || i== name.length()-1) sb.append(name.charAt(i));
            else sb.append("*");
        }
        return sb.toString();
    }
    private String getPIN(String pin) throws Exception {
        /* To Do : 비즈니스 로직 */
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < pin.length(); i ++) {
            if (('0' > pin.charAt(i) || '9' < pin.charAt(i)) && ('-' != pin.charAt(i))) {
                throw new Exception("주민번호 : 숫자가 아닙니다");
            }
            if (i > 7) sb.append("*");
            else sb.append(pin.charAt(i));
        }
        return sb.toString();
    }
    private String getCardNo(String cardNo) throws Exception {
        /* To Do : 비즈니스 로직 */
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < cardNo.length(); i ++) {
            if (('0' > cardNo.charAt(i) || '9' < cardNo.charAt(i)) && ('-' != cardNo.charAt(i))) {
                throw new Exception("카드번호 : 숫자가 아닙니다");
            }
            if ((i > 6) && ('-' !=cardNo.charAt(i))) sb.append("*");
            else sb.append(cardNo.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        Masking1 m = new Masking1();

        System.out.println(m.getName("홍아무개님"));
        System.out.println(m.getPIN("881110-2345678"));
        System.out.println(m.getCardNo("1234-5678-1234-5678"));
    }

}

