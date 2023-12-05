import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack();
        
        for(int ing :ingredient){
            stack.push(ing);
               
            while(stack.size() >= 4){
                if(stack.peek()== 1){
                    int fourth = stack.pop();
                    int third = stack.pop();
                    int second =stack.pop();
                    int first = stack.pop();
                
                    if(first == 1 && second== 2 && third== 3){
                        answer++;
                    }else{
                        //원상 복구
                        stack.push(first);
                        stack.push(second);
                        stack.push(third);
                        stack.push(fourth);
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