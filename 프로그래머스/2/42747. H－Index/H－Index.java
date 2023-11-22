import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        
        Arrays.sort(citations);
        
      //  h = citataions[0]  => n-0 = 5;
      //  h = citataions[1]  => n-1 = 4;
        
        for(int i=n-1;i>=0;i--){
            if(citations[i] == n-i){
                answer = citations[i];
                break;
            }
        }
        
        
        return answer;
    }
}