import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Sammie on 10/31/2017.
 */
public class StringIntersection {

    static String compareStrings(String s1, String s2) {
        int[] arr = new int[26];
        char c1[] = s2.toLowerCase().toCharArray();
        for (int i = 0; i < c1.length; i++) {
            arr[c1[i]-'a']++;
        }
        char c2[] = s1.toLowerCase().toCharArray();
        String s = new String();
        s = "";
        int count = 0;
        //HashSet<Character> map = new HashSet<Character>();
        for(int i=0;i<c2.length;i++) {
            if ((arr[c2[i] - 'a']) != 0 && c2[i]!= c2[i-1]) {
                //map.add(c2[i]);
                s += c2[i];
                count++;
            }
        }
        return count!=0? s : null;
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "hi";
        String s4 = "bye";
        System.out.println(compareStrings(s1, s2));
        System.out.println(compareStrings(s3,s4));
    }
}
