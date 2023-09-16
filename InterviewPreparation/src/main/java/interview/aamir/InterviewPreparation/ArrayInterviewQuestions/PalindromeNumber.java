package interview.aamir.InterviewPreparation.ArrayInterviewQuestions;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        boolean palindrome = palindrome(x);
        if (palindrome)
            System.out.println("Palindrome : ");
        else
            System.out.println("Not Palindrome");
        /*int i = 121;
        int res = 0;
        while(i > 0){
            int i1 = i % 10;
             res = res*10+i1;
             i = i / 10;
        }
        if(res == 121)
            System.out.println("yes");
        else
            System.out.println("no");*/

    }

    public static boolean palindrome(int x){
        int i = x;
        int res = 0;
        while(i > 0){
            int i1 = i % 10;
            res = res*10+i1;
            i = i / 10;
        }
        if(res == x)
            return true;
        else
            return false;
    }
}
