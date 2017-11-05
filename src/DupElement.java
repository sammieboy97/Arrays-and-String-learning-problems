/**
 * Created by Sammie on 10/30/2017.
 */
public class DupElement {

    static char Duplicate(char[] c) {
        int arr[] =  new int[26];
        for (int i = 0; i < c.length; i++) {
            //System.out.println(c[i]);
            arr[c[i]-'a']++;
        }
        char res = ' ';
        int max = Integer.MIN_VALUE;
        for(int i=0;i<26;i++) {
            if (arr[i] > max) {
                max = arr[i];
                res = (char)(i+97);
            }
        }
    return res;
    }

    public static void main(String[] args) {
        String s = "asdfghja";
        char c[] = s.toCharArray();
        System.out.println("The repeating element is " + Duplicate(c));
    }
}
