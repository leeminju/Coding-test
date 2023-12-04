import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] types = {'R','T','C','F','J','M','A','N'};
        Map<Character,Integer> map =new HashMap<>();
        
        for(int i=0;i<8;i++){
            map.put(types[i],0);
        }
        
        for(int i=0;i<survey.length;i++){
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            
            int choice = choices[i];
            if(choice < 4){
                map.put(disagree, map.get(disagree)+ 4 - choice);
            }else if(choice > 4){
                map.put(agree,map.get(agree)+choice - 4);
            }
        }
        
        for(int i=0;i<types.length;i+=2){
             if(map.get(types[i]) >= map.get(types[i+1])){
                 answer += types[i];
             }else{
                 answer += types[i+1];
             }
        }
        
        
        return answer;
    }
}