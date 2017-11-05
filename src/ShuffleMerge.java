/**
 * Created by Sammie on 11/1/2017.
 */
public class ShuffleMerge {

    static String MergeShuf(String s1, String s2) {
        char c[] = new char[s1.length() + s2.length()];
        int j = 0;
        int i = 0;
        while (j < c.length) {
            if(i<s1.length())
                c[j++] = s1.charAt(i);
            if(i<s2.length())
                c[j++] = s2.charAt(i);
            i++;
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "123";
        System.out.println(MergeShuf(s1, s2));
    }
}
