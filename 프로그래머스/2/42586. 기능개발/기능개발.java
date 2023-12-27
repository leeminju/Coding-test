import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int peek = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<progresses.length;i++){
            int day = (100 - progresses[i])/speeds[i];
            if((100 - progresses[i])%speeds[i] != 0){
                day++;
            }
            
            if(day <= peek){
                count++;
            }else{
                if(count != 0){
                    list.add(count);
                }
                peek = day;
                count = 1;
            }
        }
        
        list.add(count);
        
        answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}