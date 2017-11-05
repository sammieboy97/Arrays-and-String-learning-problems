/**
 * Created by Sammie on 10/31/2017.
 */
public class RemoveStringPattern {

    static void Removepat(String s, String pat) {
        String s2 = s.replace(pat, "");
        System.out.println(s2);
    }

    static void RemoveMultChar(String s, String mult) {
        char ch[] = mult.toCharArray();
        String s1 = new String();
        for (int i = 0; i < ch.length; i++) {
            s = s.replace(String.valueOf(ch[i]),"");
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s = "Hello World hi!";
        String pat = "llo";
        String multChars = "lhe";
        //Removepat(s, pat);
        RemoveMultChar(s,multChars);
    }
}
