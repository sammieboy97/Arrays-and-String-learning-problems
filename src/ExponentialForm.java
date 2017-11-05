import java.util.ArrayList;

/**
 * Created by Sammie on 11/2/2017.
 */
public class ExponentialForm {

    static String Expo(String s) {
        int n = Integer.valueOf(s);
        System.out.println(n);
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 2; i <= n ; i++) {
            if (n % i == 0) {
                int count = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                int digCount = 0;
                if (count == 0) {
                    if (!al.isEmpty()) {
                        al.add('X');
                    }
                    al.add(Character.forDigit(i,10));
                    while (n % i == 0) {
                        digCount++;
                        n /= i;
                    }
                    al.add('^');
                    if (digCount != 0) {
                        al.add(Character.forDigit(digCount,10));
                    }
                    else
                        al.add('1');
                }
            }
        }
        String s1 = new String();
        for (char x : al) {
            s1 += x;
        }
        return s1;
    }
    public static void main(String[] args) {
        String s = "245";
        System.out.println(Expo(s));
    }
}
