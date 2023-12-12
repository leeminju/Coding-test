import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] nums = s.split(" ");

        String max= Arrays.stream(nums).max(Comparator.comparing(Integer::parseInt)).orElse("0");	
        String min= Arrays.stream(nums).min(Comparator.comparing(Integer::parseInt)).orElse("0");	
        answer = min+" "+max;
        
        
        return answer;
    }
}