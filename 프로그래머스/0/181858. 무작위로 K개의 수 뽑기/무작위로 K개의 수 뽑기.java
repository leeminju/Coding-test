import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i]))
                list.add(arr[i]);
        }
        
        int idx =0;
        for(idx=0; idx < Math.min(list.size(),k);idx++){
            answer[idx] = list.get(idx);
        }
        
        while(idx < k){
            answer[idx++]=-1;
        }
      
        
        return answer;
    }
}