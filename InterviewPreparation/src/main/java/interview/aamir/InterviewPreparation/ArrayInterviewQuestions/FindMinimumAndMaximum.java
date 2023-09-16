package interview.aamir.InterviewPreparation.ArrayInterviewQuestions;

import java.util.Arrays;

public class FindMinimumAndMaximum {
    public static void main(String[] args) {
        int[] arr = {1,-1,-7,-8,3,4,5,9,7,8,2,4,2};
        Arrays.sort(arr);
        int n = arr.length;
        int min = arr[0];
        int max = arr[n-1];
        System.out.println("Maximum and Minimum number : " + min + " " +max);
    }


}
