import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Sammie on 10/30/2017.
 */
public class insertCharacter {
    public static void main(String[] args) {
        String s = "Hello";
        ArrayList<Character> al = new ArrayList<Character>();
        char c[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            al.add(c[i]);
        }
        char ins = 'm';
        int pos = 3;
        al.add(pos-1,ins);
        Iterator i = al.iterator();
        s = "";
        while (i.hasNext()) {
            s += i.next();
        }
        System.out.println(s);
    }
}
