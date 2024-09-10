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

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for(int i=0;i<queue1.length;i++){
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }

        
        int count = 0;
        while(true){
            if(count > (queue1.length*2)+2){
                return -1;
            }
            
            if(sum1 > sum2){
                int num = q1.poll();
                q2.offer(num);
            
                sum1 -= (long)num;
                sum2 += (long)num;
            }else if(sum1 < sum2){
                int num = q2.poll();
                q1.offer(num);
            
                sum1 += (long)num;
                sum2 -= (long)num;
            }else{
                return count;
            }
            count++;
            
        
        }
        
        
    }
}