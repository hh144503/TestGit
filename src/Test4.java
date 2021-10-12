/**
 * @author huhai
 * @version 1.0
 * @date 2021/9/1 22:44
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println("01");
        String s = "abcdf" ;
        if (s.contains("bcd")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        if (s.indexOf("bcd") >= 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
