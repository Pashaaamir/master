package interview.aamir.InterviewPreparation.Mathematicl;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -120;
        int reverse = 0;
        if (x < 0) {
            int rev = 0;
            int abs = Math.abs(x);
            while (abs > 0) {
                int rem = abs % 10;
                rev = rev * 10 + rem;
                abs = abs / 10;
            }
            reverse = -rev;
        } else {
            int rev1 = 0 ;
            while (x > 0) {
                int rem = x % 10;
                rev1 = rev1 * 10 + rem;
                x = x / 10;
            }
            reverse = rev1;
        }
        System.out.println(reverse);
    }


    class Solution {
        public int reverse(int x) {
            int reverse = 0;
            while (x != 0) {
                int pop = x % 10;
                if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) {
                    return 0;
                }
                if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) {
                    return 0;
                }
                reverse = reverse * 10 + pop;
                x /= 10;
            }
            return reverse;
        }
    }

}
