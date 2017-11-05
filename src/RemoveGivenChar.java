/**
 * Created by Sammie on 10/31/2017.
 */
public class RemoveGivenChar {

    static void RemoveChars(String s, char rem) {
        String s1 = s.replaceAll(String.valueOf(rem), "");
        System.out.println(s1);
    }

    public static void main(String[] args) {
        String s = "Hello";
        char rem = 'l';
        RemoveChars(s, rem);
    }
}
