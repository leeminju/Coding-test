import java.util.*;
class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Long,Long> map = new HashMap<>(); // 몸무게, 사람 수
        
        for(int weight : weights){
            Long w = (long) weight;
            map.put(w,map.getOrDefault(w,(long)0)+1);
        }
        
        for (Map.Entry<Long,Long> entry1 : map.entrySet()) {
            //같은 몸무게인 사람이 여러명일 때 그 사람들끼리의 쌍의 수
            long w1 = entry1.getKey();
            long count1 = entry1.getValue();
            
            if(count1 > 1){
                long sum=0;
                for(long i=1;i<count1;i++){
                    sum += i;
                }
                answer += sum;
            }
       
            
            for (Map.Entry<Long,Long> entry2 : map.entrySet()) {
                long w2 = entry2.getKey();
                long count2 = entry2.getValue();
                
                if(count2 == 0){
                    continue;
                }
   
                if(w1 != w2){
                    long small = Math.min(w1,w2);
                    long big = Math.max(w1,w2);
                    
                    if(small * 4 == big * 3 || small * 4 == big * 2 || small * 3 == big * 2){    
                        answer+=count1*count2;
                    }
                }
            }
                
            map.put(w1,(long)0);    
        }
        
        return answer;
    }
    
}
