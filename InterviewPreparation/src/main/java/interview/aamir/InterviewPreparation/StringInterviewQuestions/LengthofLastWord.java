package interview.aamir.InterviewPreparation.StringInterviewQuestions;

public class LengthofLastWord {
    public static void main(String[] args) {
       String str =  "    day";
        int count = 0 ;
        String trim = str.trim();
        if(trim.length() == 1){
            count++;
        }
        int n = trim.length()-1;
        for(int right = n  ; right >= 0 ;right--){
            char c = trim.charAt(right);
            if(c == ' ')
               break;
            else
                count++;
        }
        System.out.println(count);
    }

    /*public static int lengthOfLastWord(String s){
        for(int i=0 ; i<s.length();i++){
            char c = s.charAt(i);
        }
        if(s.length() == 0 ){
            return 0;
        }if(s.length() > 0 ){
            s.trim();
            int right = s.length()-1;
            while (right >= 0){

            }
        }
        return 0;
    }*/
}
