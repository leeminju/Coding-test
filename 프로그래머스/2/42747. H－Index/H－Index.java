import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int cnt = 0;// 0 ~ n  사이
        int h = 0;
        int n = citations.length;
        
        
        Arrays.sort(citations);
               
        for(int i=0;i<n;i++)
        {
            if(citations[i] > n-i){ 
                if(h < n-i){
                    h = n-i;
                }       
                break;
            }
            
            h = citations[i];//인용 횟수
        }
        
        return h;
    }
}