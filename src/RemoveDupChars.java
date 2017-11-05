/**
 * Created by Sammie on 10/31/2017.
 */
public class RemoveDupChars {

   /* static String removeDup(String s) {
        StringBuilder sb = new StringBuilder(s);
        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (sb.substring(i + 1).indexOf(ch[i])>i) {
                System.out.println("Entered with ss as "+sb.substring(i+1));
                int temp = sb.substring(i + 1).indexOf(ch[i]);
                sb.deleteCharAt(temp+1);
            }
        }

        return sb.toString();
    } */

    static String removeDup(String s) {
        char ch[] = s.toCharArray();
        /*System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            int temp = s.substring(i+1).indexOf(ch[i]);
            System.out.println(temp);
            if (temp > i) {
                s = s.substring(0, temp+i+1) + s.substring(temp+i+2);
            }
        } */
        String s1 = new String();
        for (int i = 0; i < s.length(); i++) {
            if (!s1.contains(String.valueOf(ch[i]))) {
                s1 += ch[i];
            }
        }

        return s1;
    }

    public static void main(String[] args) {
        String s = "Hello World Hi!";
        System.out.println(removeDup(s));
    }
}
