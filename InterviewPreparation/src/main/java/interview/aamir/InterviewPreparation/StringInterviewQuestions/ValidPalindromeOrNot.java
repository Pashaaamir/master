package interview.aamir.InterviewPreparation.StringInterviewQuestions;

public class ValidPalindromeOrNot {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean b = validPalindrome(str);
        if(b){
            System.out.println("Given String is a palindrome : ");
        }else{
            System.out.println("Given String is not a palindrome : ");
        }
    }

    public static boolean validPalindrome(String str){
        if(str == " "){
            return true;
        }
        str =str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left = 0;
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
