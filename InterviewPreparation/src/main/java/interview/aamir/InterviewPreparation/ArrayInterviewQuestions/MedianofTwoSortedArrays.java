package interview.aamir.InterviewPreparation.ArrayInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2};
        int[] arr2 = {3,4};
        int first = arr1.length;
        int second = arr2.length;
        int i = 0; int j = 0 ; int  k = 0;
        int[] myArray = new int[first+second];
        while (i<first && j < second){
            if(arr1[i] <arr2[j]) {
                myArray[k] = arr1[i];
                i++;
            }
            else {
                myArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i<first){
            myArray[k]= arr1[i];
            i++;
            k++;
        }
        while (j  < second){
            myArray[k]= arr2[j];
            j++;
            k++;
        }

        if((first+second)%2 !=0){
            System.out.println(myArray[(first+second)/2]);
        }else {
            int i1 = first + second / 2;
            double i2 = myArray[i1];
            double i3 = myArray[i1-1];
            double v = (i2 + i3) / 2;
            System.out.println(v);
        }

    }

}
