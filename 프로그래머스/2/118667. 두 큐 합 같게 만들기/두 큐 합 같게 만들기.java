import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long sum1 = Arrays.stream(queue1).sum();
        long sum2 = Arrays.stream(queue2).sum();
        if(sum1 == sum2){
            return 0;
        }
        
        //모든 원소의 합이 홀수인 경우는 큐의 원소 합이 같을 수가 없으므로 제외
        if((sum1 + sum2)%2==1){
            return -1;
        }

        Queue<Long> q1 = new LinkedList<>();
        Queue<Long> q2 = new LinkedList<>();
        long half = 0;
        
        for(int i=0;i<queue1.length;i++){
            q1.offer((long)queue1[i]);
            q2.offer((long)queue2[i]);
        }
        
        half = (sum1 + sum2)/2;
        
        int count = 0;
        while(true){
            if(count > (queue1.length*3)-3){
                return -1;
            }
            
            if(sum1 > sum2){
                long num = q1.poll();
                q2.offer(num);
            
                sum1 -= num;
                sum2 += num;
            }else if(sum1 < sum2){
                long num = q2.poll();
                q1.offer(num);
            
                sum1 += num;
                sum2 -= num;
            }else{
                return count;
            }
            count++;
            
        
        }
        
        
    }
}