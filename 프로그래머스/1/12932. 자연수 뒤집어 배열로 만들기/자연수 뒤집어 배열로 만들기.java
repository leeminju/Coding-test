import java.util.*;
class Solution {
    public long[] solution(long n) {
        ArrayList<Long> answer = new ArrayList<>();
    
        while(n > 0){
            answer.add(n % 10);
            n /= 10;
        }
        return answer.stream().mapToLong(i->i).toArray();
    }
}