import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        if(set.size() >= n/2){
            return n/2;
        }else{
            return set.size();
        }
        
    }
}