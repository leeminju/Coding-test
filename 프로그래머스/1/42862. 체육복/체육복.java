import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] count = new int[n];
        
        //문제에서 lost나 reserve가 정렬되어 있다는 언급이 없기 때문에 예제만 보고 정렬되어 있다고 가정하면 안 됩니다.
        Arrays.fill(count,1);
        
        for(int num:reserve){
            count[num-1]++;
        }
        // 여벌 체육복이 있는 학생도 도난당할 수 있습니다. 즉, reserve에 속한 원소가 lost에도 속할 수 있습니다.
        for(int num:lost){
            count[num-1]--;
        }
      
        for(int i=0;i<n;i++){
            if(count[i]== 0){
                //체육복 없다.
                if(i>0 && count[i-1] == 2){
                    count[i-1]--;
                    count[i]++;
                }else if(i<n-1 && count[i+1]==2){
                    count[i+1]--;
                    count[i]++;
                }else{
                    answer--;
                }
            }   
        }
        
        return answer;
    }
}