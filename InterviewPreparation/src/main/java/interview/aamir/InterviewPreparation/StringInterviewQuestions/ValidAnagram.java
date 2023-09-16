package interview.aamir.InterviewPreparation.StringInterviewQuestions;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram"; String t = "nagaram";
        boolean b = validAnagram(s, t);
        if(b){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }

    }

    public static boolean validAnagram(String str , String str1){
        char[] chars = str.toCharArray();
        char[] chars1 = str1.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        String string = new String(chars);
        String string1 = new String(chars1);

        if(string.equals(string1))
            return true;
        return false;

    }
}
