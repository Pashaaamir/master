package interview.aamir.InterviewPreparation.ArrayInterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstNonReapeatingElementToArray {
    public static void main(String[] args) {
        int [] array = {10, 20,3, 40, 30, 50, 20, 10, 20};
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        for(int i = 0 ;i < array.length;i++) {
            if (linkedHashMap.containsKey(array[i])) {
                int old_val = linkedHashMap.get(array[i]);
                int new_val = old_val + 1;
                linkedHashMap.put(array[i], new_val);
            } else
                linkedHashMap.put(array[i], 1);
        }
            Set<Map.Entry<Integer, Integer>> entries = linkedHashMap.entrySet();
            for (Map.Entry<Integer, Integer> entry : entries) {
                if(entry.getValue() == 1){
                    System.out.println("First non repeating element in array : " + entry.getKey());
                    break;
                }
            }

        }
    }

