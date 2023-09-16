package interview.aamir.InterviewPreparation.StringInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
       String s = "cbacdcbc";
        SortedSet<Character> sortedSet = new TreeSet<>();
        int left = 0 ;
        while (left < s.length()){
            if(sortedSet.contains(s.charAt(left))){
                char c = s.charAt(left);
                sortedSet.remove(c);
                sortedSet.add(s.charAt(left));
            }else{
                sortedSet.add(s.charAt(left));
            }
            left++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : sortedSet) {
            stringBuilder.append(character);
        }
        String result = stringBuilder.toString();
        System.out.println("SortedSet as a String: " + result);
    }
}
