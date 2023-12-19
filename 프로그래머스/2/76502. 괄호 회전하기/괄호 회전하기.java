import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int x=0;x<s.length();x++){
            String temp = s.substring(1);
            char first = s.charAt(0);
            s = temp + first;
            if(isOk(s)){
                answer++;
            }
        }
        
        
        return answer;
    }
    
    boolean isOk(String s){
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        if(array[0] == '}' || array[0] == ']' || array[0] == ')'){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty()){
                if(array[i] == '}' && stack.peek() == '{'){
                    stack.pop();
                }else if(array[i] == ']' && stack.peek() == '['){
                    stack.pop();
                }else if(array[i] == ')' && stack.peek() == '('){
                    stack.pop();    
                }else{
                    stack.push(array[i]);
                }
            }else{
                stack.push(array[i]);
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}