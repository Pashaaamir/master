package interview.aamir.InterviewPreparation.Demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
         String m = "Mohammad Aamir";
        String s = m.toUpperCase();
        int length = s.length();
       /* Map<String,Long> newMap = Arrays.stream(m.split("")).map(String::toUpperCase).
                collect(Collectors.groupingBy(s->s,
                LinkedHashMap::new,Collectors.counting()));
        System.out.println(newMap);*/


        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = length-1; i >= 0; i--){
            if(map.containsKey(s.charAt(i))){
                int c = map.get(s.charAt(i));
                map.put(s.charAt(i),++c);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }





    }

}
