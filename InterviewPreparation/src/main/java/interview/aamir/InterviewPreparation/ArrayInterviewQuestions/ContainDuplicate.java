package interview.aamir.InterviewPreparation.ArrayInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] array = {1,2,3,1};
        boolean duplicate = duplicate(array);
        System.out.println(duplicate);

    }

    public static boolean duplicate(int[] array){
        Set<Integer> set = new HashSet<>();
        int n = array.length;
        int right = 0;
        boolean b = false;
        while (right < n){
            if(set.contains(array[right])){
                b = true;
            }
            set.add(array[right]);
            right++;
        }
        return b;
    }
}
