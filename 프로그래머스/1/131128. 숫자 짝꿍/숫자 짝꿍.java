import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] x_arr= new int[10];//0-9;
        int[] y_arr= new int[10];//0-9;
        
        for(int i=0;i<X.length();i++){
            x_arr[X.charAt(i)-'0']++;    
        }
        
        for(int i=0;i<Y.length();i++){
            y_arr[Y.charAt(i)-'0']++;    
        }
        
        
        for(int i=9;i>=0;i--){
            if(x_arr[i] > 0 && y_arr[i]>0){
                int cnt = Math.min(x_arr[i],y_arr[i]);
                answer += String.valueOf(i).repeat(cnt);
            }
        }
        
        if(answer == ""){
            return "-1";
        }
        if(answer.charAt(0)=='0'){
            return "0";
        }
        
        return answer;
    }
}