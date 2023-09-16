package interview.aamir.InterviewPreparation.StringInterviewQuestions;

public class ReverseWordsInAString {
    public static void main(String[] args) {
       String s = "the sky is blue";
        String s1 = reverseWords(s);
        System.out.println("reverse words : " + s1);

    }

    public static String reverseWords(String s) {
        s.trim();
        String[] split = s.split("\\s+"); // Split by one or more spaces
        int n = split.length;
        for (int i = 0; i < n / 2; i++) {
            String s1 = split[i];
            split[i] = split[n - 1 - i];
            split[n - 1 - i] = s1;
        }
        String finalString = String.join(" ", split);
        return finalString;
    }
}

