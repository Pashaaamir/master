package interview.aamir.InterviewPreparation.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MargeTwoSortedList {
    public static void main(String[] args) {
       List<Integer> list1 =  Arrays.asList(1,2,4);
       List<Integer> list2 = Arrays.asList(1,3,4);
        ArrayList<Integer> merge = new ArrayList<Integer>();
        merge.addAll(list1);
        merge.addAll(list2);
        System.out.println(merge);
    }
}
