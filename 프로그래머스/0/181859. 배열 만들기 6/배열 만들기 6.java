import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        
        while(i < arr.length){
            if(stk.isEmpty()){
                stk.push(arr[i++]);
            }else if(stk.peek() == arr[i]){
                stk.pop();
                i++;
            }else{
                stk.push(arr[i++]);
            }
        }
        
        if(stk.isEmpty()){
            return new int[]{-1};
        }
        
        answer = new int[stk.size()];
        int idx = stk.size()-1;
        
        while(!stk.isEmpty()){
            answer[idx--] = stk.pop();
        }
        
        return answer;
    }
}