package interview.aamir.InterviewPreparation.ArrayInterviewQuestions;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[]  nums = {0,1,2};
        int i = firstMissingPositive(nums);
        System.out.println("Missing positive : " + i);
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1];

        for (int num : nums) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return n + 1;
    }
}
