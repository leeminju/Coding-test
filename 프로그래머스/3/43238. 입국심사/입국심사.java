import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        int max = Arrays.stream(times).max().getAsInt();
        
        long low = 1;//6분
        long high = n * (long)max;//60분
        long mid= (low+high) / 2;
        
        //모든 사람이 심사를 받는 데 mid분 이내로 걸릴 수 있는지 판단하는 코드의 일부입니다.
        while(low <= high){
            mid = (low + high) / 2;
            long cnt = 0;
            for (int i = 0; i < times.length ; i++) {
                cnt += mid / times[i];
                if(cnt > n){
                    break;
                }
            }
            
            if(cnt < n){
                low = mid + 1;
            }else if(cnt >= n){
                answer = mid;
                high = mid -1;
            }
        }
        
        
        return answer;    
    }
}