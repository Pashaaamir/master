package interview.aamir.InterviewPreparation.ArrayInterviewQuestions;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        HashMap<Integer,Integer> integerIntegerHashMap = new HashMap<>();
        for(int i =0 ; i < nums.length;i++){
            integerIntegerHashMap.put(nums[i],i);
        }
        for(int i = 0; i < nums.length ; i ++){
            int num = nums[i];
            int rem = target - num;
            if(integerIntegerHashMap.containsKey(rem)){
                int integer = integerIntegerHashMap.get(rem);
                if(integer == i) continue;
                //return new int[]{i,integer};
            }
        }

    }
}
