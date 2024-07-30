import java.util.*;
class Solution {
    public String solution(String s) {
        if(s.length() == 1)
            return s;
        
        String answer = "";
        char[] array = s.toCharArray();
    
        Arrays.sort(array);
        
        if(array[0] != array[1]){
            answer += array[0];
        }
        
        for(int i=1;i<array.length-1;i++){
            if(array[i] != array[i-1] && array[i] != array[i+1]){
                answer += array[i];
            }    
        }
        
        if(array[array.length-1] != array[array.length-2])
            answer += array[array.length-1];
        
        return answer;
    }
}