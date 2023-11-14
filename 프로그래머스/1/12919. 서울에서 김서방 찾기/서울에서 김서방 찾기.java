import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        
        int start = 0;
        int last = seoul.length;
        int mid = seoul.length/2;
       
         
        while(start<last){
            mid = (start+last)/2;
            if(seoul[mid].equals("Kim")){
                return "김서방은 "+mid+"에 있다";
            }
            
            String[] front=Arrays.copyOfRange(seoul,start, mid);
            if(Arrays.asList(front).contains("Kim")){
                last = mid;
            }else{
                start = mid;
            }
        }
        return "";
    }
}