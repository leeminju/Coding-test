import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list =new ArrayList<>();
        
        for(int num:arr){
            for(int i=0;i<num;i++)
                list.add(num);
        }
        
        answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}