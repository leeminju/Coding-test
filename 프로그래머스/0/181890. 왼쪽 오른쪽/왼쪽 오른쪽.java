import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        boolean first = false;
        boolean rightStart = false;
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();
        
        for(String str : str_list){
            if(str.equals("l")){
                if(!first){
                    first = true;
                    break;   
                }
            }else if(str.equals("r")){
                if(!first){
                    first = true;
                    rightStart = true;
                    continue;
                }
            }
            
            if(!rightStart){
                left.add(str);
            }else{
                right.add(str);
            }
        }
        
        // l과 r 등장 한적 없음
        if(!first){
            return answer;
        }
        
        // r이 먼저 등장함.
        if(rightStart){
            if(right.isEmpty())
                return answer;
            
            answer = new String[right.size()];
            for(int i=0;i<right.size();i++){
                answer[i]=right.get(i);
            }
            
        }else{
        // l 이 먼저 등장함.
            if(left.isEmpty())
                return answer;
            
            answer = new String[left.size()];
            for(int i=0;i<left.size();i++){
                answer[i]=left.get(i);
            }
            
            
        }
        
        return answer;
    }
}