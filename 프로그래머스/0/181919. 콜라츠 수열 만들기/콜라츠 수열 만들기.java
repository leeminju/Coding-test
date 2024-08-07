import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int x = n;
        
        while(x > 1){
            list.add(x);
            if(x % 2 == 0){
                x /= 2;
            }else{
                x = 3*x +1;
            }
        }
        
        list.add(1);
        
        answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}