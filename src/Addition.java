import java.util.ArrayList;

/**
 * Created by Sammie on 11/2/2017.
 */
public class Addition {

    static String Adding(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        StringBuilder sb1 = new StringBuilder(s2);
        sb1.reverse();
        char ch[] = sb.toString().toCharArray();
        char ch1[] = sb1.toString().toCharArray();
        int i = 0;
        int j = 0;
        char carry = 0;
        ArrayList<Character> al = new ArrayList<Character>();
        for (i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++) {
            int sum;
            if (carry != (char)48) {
                sum = (char) (ch[i] + ch[j]);
                int temp = (ch1[j] - '0') + (ch[i] - '0');
                System.out.println(temp);
                if (temp >= 10) {
                    //System.out.println("Entered");
                    carry = (char) 48;
                    temp = temp - 10;
                } else {
                    carry = 0;
                }
                al.add(Character.forDigit(temp,10));
            } else {
                System.out.println("Entered");
                int temp = (ch[i]-'0' + ch1[j]-'0' + carry-'0') + 1;
                System.out.println(temp);
                if (temp >= 10) {
                    //System.out.println("Entered");
                    carry = (char) 48;
                    temp = temp - 10;
                } else {
                    carry = 0;
                }
                al.add(Character.forDigit(temp,10));
            }

            // System.out.println(ch[i]);
        }
        if (s1.length() > s2.length()) {
            for (int t = i; t < ch.length; t++) {
                int temp = (carry - '0') + ch[t];
                carry = 0;
                System.out.println(temp);
                al.add(Character.forDigit(temp,10));
            }
        } else if (s1.length() < s2.length()) {
            for (int t = i; t < ch1.length; t++) {
                int temp = (carry - '0') + ch1[t];
                carry = 0;
                System.out.println(temp);
                al.add(Character.forDigit(temp,10));
            }
        }

        String s = new String();
        for (char x : al) {
            s +=x;
        }
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "123259";
        String s2 = "483";
        System.out.println(Adding(s1,s2));
    }
}
