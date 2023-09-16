package interview.aamir.InterviewPreparation.StringInterviewQuestions;


import java.awt.geom.CubicCurve2D;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HackerRankTest{
    public static void main(String[] args) {
        String str = "bab";
        str.length();
        boolean b = strPalindrome(str);
        if(b){
            System.out.println("the string is a palindrome : ");
        }else {
            System.out.println("the string is not a palindrome :");
        }

    }

    public  static boolean strPalindrome(String str){
        int left = 0 ;
        int right = str.length()-1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
