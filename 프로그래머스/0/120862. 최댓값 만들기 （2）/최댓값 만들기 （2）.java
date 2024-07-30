import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        if(numbers[0] < 0 && numbers[0] < 0){
            int temp  = numbers[0] * numbers[1];
            if(temp > answer){
                return temp;
            }
        }
        
        
        return answer;
    }
}