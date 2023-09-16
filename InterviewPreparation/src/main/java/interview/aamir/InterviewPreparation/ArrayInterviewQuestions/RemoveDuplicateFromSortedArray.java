package interview.aamir.InterviewPreparation.ArrayInterviewQuestions;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        /*int [] array = {1,1,2};
        int i = removeDuplicatedFromSortedArray(array);
        System.out.println(i);*/
    }
    /*public static int removeDuplicatedFromSortedArray(int[] array){
        int len = array.length;
        *//*int j = 0;
        for(int i = 0; i < len ; i++){
            if(array[j] != array[i]){
                array[++j] = array[i];
            }
        }
        return ++j;*//*

        *//*int len = array.length;
        int count = 0;
        SortedSet<Integer> sortedSet = new TreeSet<Integer>();
        for(int i = 0; i < len ; i++){
           if(sortedSet.add(array[i]) == false)
               count++;
           sortedSet.add(array[i]);
        }
        return count+1;*//*
    }*/
}
