package interview.aamir.InterviewPreparation.ArrayInterviewQuestions;

import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length;i++ ){
            if(map.containsKey(arr[i])) {
                int  old_val = map.get(arr[i]);
                int new_val = old_val + 1;
                map.put(arr[i],new_val);
            }else{
                map.put(arr[i],1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(entry.getValue() == 1){
                int value = entry.getKey();
                System.out.println(value);
            }
        }


    }
}
