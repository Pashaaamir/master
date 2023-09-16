package interview.aamir.InterviewPreparation.StringInterviewQuestions;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "babad";
    }

    public static String findLongestPalinfromicSubString(String s){
        //by using expand from the centre algorithm
        int end = 0 , start = 0;
        for(int i = 0 ; i < s.length(); i++){
            int len1 = expandFromTheCentre(s,i,i+1);
            int len2 = expandFromTheCentre(s,i,i);
            int len = Math.max(len1,len2);
            if(end-start < len){
                start = i - (len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);
    }

    static int expandFromTheCentre(String str , int i ,int j){
        while (i >= 0 && j < str.length() && str.charAt(i) == str.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
}
