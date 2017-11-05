import java.util.ArrayList;

/**
 * Created by Sammie on 11/1/2017.
 */
public class RunLengthEncoding {

    static String encodedString(String s) {
        char ch[] = s.toCharArray();
        int count = 1;
        String s1 = new String();
        ArrayList<Character> al = new ArrayList<Character>();
        for (int i = 0; i < ch.length; i++) {
            if (!al.contains(ch[i])) {
                if(count != 1)
                    al.add(Character.forDigit(count,10));
                al.add(ch[i]);
                count = 1;
            }
            else count++;
        }
        if (count != 1) {
            al.add(Character.forDigit(count, 10));
        }
        for (char x : al) {
            s1 += x;
        }
        return s1;
    }

    public static void main(String[] args) {
        String s = "aaaaarrrb";
        System.out.println(encodedString(s));
    }
}
