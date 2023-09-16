package interview.aamir.InterviewPreparation.ArrayInterviewQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        int size = integerList.size();
        System.out.println(integerList);
        List<Integer> integerList1 = new ArrayList<>();
        for(int i = size-1;i >=0 ; i--){
            Integer integer = integerList.get(i);
            integerList1.add(integer);
        }
        System.out.println(integerList1);

    }
}
