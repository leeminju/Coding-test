import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        Stack<Integer> stack = new Stack<>();
        int i=0;
        
        while(i < arr.length){
            if(stack.isEmpty()){
                stack.push(arr[i++]);
            }else if(stack.peek() < arr[i]){
                stack.push(arr[i++]);
            }else{
                stack.pop();
            }
        }
        
        stk = new int[stack.size()];
        int idx = stack.size()-1;
        
        while(!stack.isEmpty()){
            stk[idx--] = stack.pop();    
        }
        
        return stk;
    }
}