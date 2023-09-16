package interview.aamir.InterviewPreparation.StringInterviewQuestions;

import java.util.Arrays;

public class ReverseStringWithSC1 {
    public static void main(String[] args) {
       String[] s = {"h","e","l","l","o"};
       for(int i = 0 ; i < s.length /2; i++){
           String temp = s[i];
           s[i] = s[s.length-1-i];
           s[s.length-i-1] = temp;
       }
        String s1 = Arrays.toString(s);
        System.out.println(s1);
    }
}
