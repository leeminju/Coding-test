import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int prime_number = find(n);
        Set<Integer> set = new HashSet<>();
        
        if(prime_number == n){
            answer = new int[1];
            answer[0]=n;
            return answer;
        }else{
            while(find(n) != -1){
                set.add(prime_number);
                n = n/prime_number;
                prime_number = find(n);
            }
        }
        
        answer = new int[set.size()];
        int index = 0;
        for(int num : set){
            answer[index++] = num;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
    
    private int find(int num){
        for(int i=2;i<= num;i++){
            if(num % i == 0)
                return i;
        }
        return -1;
    }
}