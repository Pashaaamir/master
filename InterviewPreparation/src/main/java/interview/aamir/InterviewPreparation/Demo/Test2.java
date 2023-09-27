package interview.aamir.InterviewPreparation.Demo;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
       String s = "abcabcbb";
        int length = s.length();
        int left = 0 , right = 0 ;
        int max = 0;
        HashMap<Character,Integer > map = new HashMap<>();
        while(right< length){
            if(map.containsKey(s.charAt(right)))
                left = Math.max(map.get(s.charAt(right))+1,left);

            map.put(s.charAt(right),right);
            max= Math.max(max,right-left+1);
            right++;

        }
        System.out.println(max);
    }
}
