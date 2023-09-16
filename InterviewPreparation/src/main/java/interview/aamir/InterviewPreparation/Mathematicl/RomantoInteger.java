package interview.aamir.InterviewPreparation.Mathematicl;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public static void main(String[] args) {
       String s = "III";
        int i = romanToInt(s);
        System.out.println(i);
    }

    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res = 0;
        for(int i = 0 ; i < s.length();i++){
            Integer first = map.get(s.charAt(i));
            Integer second = 0;
            if(i+1 < s.length()){
              second =  map.get(s.charAt(i+1));
              if(first < second){
                  res += second-first;
                  i++;
              }else{
                  res += first;
              }

            }else {
                res += first;
            }
        }

        return res;
    }
}
