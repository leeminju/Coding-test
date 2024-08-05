import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer={};
        List<String> list = new ArrayList<>();
        String[] temp = my_string.split(" ");
        
        for(String t : temp){
            if(t.length() > 0){
                list.add(t);
            }
        }
        
        answer = new String[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}