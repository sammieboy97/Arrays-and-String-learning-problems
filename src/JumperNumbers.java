/**
 * Created by Sammie on 10/31/2017.
 */
public class JumperNumbers {

    static boolean CheckJump(char c[]) {
        for (int i = 0; i < c.length-1; i++) {
            if (Character.compare(c[i], c[i + 1]) > Math.abs(1) || c[i] == c[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "2345432321";
        char c[] = s.toCharArray();
        System.out.println(CheckJump(c));
        s = "234543321";
        char c1[] = s.toCharArray();
        System.out.println(CheckJump(c1));
    }
}
