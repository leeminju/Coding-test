import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0;
        int right = 0;
        int partSum = sequence[0];//부분 수열의 합
        int n = sequence.length;
        
        List<PartialSequence> parts = new ArrayList<>();
        
        while(true){
            if(partSum == k){
                parts.add(new PartialSequence(left,right));
            }
            
            if(left == n && right == n)
                break;
            
            if(partSum <= k && right < n){
                right++;
                
                if(right < n)
                    partSum += sequence[right];
            }else{
                if(left < n)
                    partSum -= sequence[left];
                left++;  
            }
        }
        
        parts.sort(PartialSequence::compareTo);
        
        return new int[]{parts.get(0).left, parts.get(0).right};
    }
    
    private class PartialSequence implements Comparable<PartialSequence>{
        int left,right,size;
        
         public PartialSequence(int left, int right) {
            this.left = left;
            this.right = right;
            this.size = right - left;
        }

        @Override
        public int compareTo(PartialSequence o) {
            if(this.size == o.size){
                return this.left - o.left;
            }
            return this.size - o.size;
        }
    }
}