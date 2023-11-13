import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] count = new int[n+1];
        
        //문제에서 lost나 reserve가 정렬되어 있다는 언급이 없기 때문에 예제만 보고 정렬되어 있다고 가정하면 안 됩니다.
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        Arrays.fill(count,1);     
        for(int num:reserve){
            count[num]++;
        }
        // 여벌 체육복이 있는 학생도 도난당할 수 있습니다. 즉, reserve에 속한 원소가 lost에도 속할 수 있습니다.
        for(int num:lost){
            count[num]--;
        }
      
        
        for(int i=1;i<=n;i++){
            System.out.println(count[i]);
        }     
        
        for(int num:lost){
            //체육복 없는 학생번호
            if(count[num]!=0)
                continue;
            
           if(num-1 >=1 && count[num-1] == 2){
                count[num-1]--;
                count[num]++;
                continue;
           }
           
            if(num+1 <= n && count[num+1] == 2){
                count[num+1]--;
                count[num]++;
            }
            
        }
        
        for(int i=1;i<=n;i++){
            if(count[i]>0)
                answer++;
        }
        
        return answer;
    }
}