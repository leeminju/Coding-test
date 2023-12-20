import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int h = 0;
        int n = citations.length;
        
        
        Arrays.sort(citations);
               
        for(int i=0;i<n;i++)
        {
            // n - i = citations[i]번 이상 인용된 논문 수
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