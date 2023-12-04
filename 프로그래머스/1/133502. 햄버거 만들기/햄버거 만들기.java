import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack();
        
        for(int ing :ingredient){
            stack.push(ing);
               
            while(stack.size() >= 4){
                if(stack.peek()== 1){
                    int first = stack.pop();
                    int second = stack.pop();
                    int third =stack.pop();
                    int fourth = stack.pop();
                
                    if(second == 3 && third== 2 && fourth == 1){
                        answer++;
                    }else{
                        //원상 복구
                        stack.push(fourth);
                        stack.push(third);
                        stack.push(second);
                        stack.push(first);
                        break;
                    }
                }else{
                    break;
                }       
            }
            
        }
        
        
        return answer;
    }
}