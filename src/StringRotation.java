/**
 * Created by Sammie on 11/1/2017.
 */
public class StringRotation {

    static void rotateChar(char ch[], int x) {
        char temp = ch[0];
        for (int k = 0; k < ch.length-1; k++) {
            ch[k] = ch[(k + 1)];
        }
        ch[ch.length-1] = temp;
    }

    static String rotate(String s, int x) {
        char ch[] = s.toCharArray();
        for (int i = 0; i < x; i++) {
            rotateChar(ch,x);
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String s = "abcdefgh";
        int x = 4;
        s = rotate(s,x);
        System.out.println(s);
    }
}
