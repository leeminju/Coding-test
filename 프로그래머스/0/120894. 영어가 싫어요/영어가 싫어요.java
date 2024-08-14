import java.util.*;
class Solution {
    public long solution(String numbers) {
        String answer = "";
        String[] array = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        while(numbers.length() > 0){
            int idx =0;
            for(int i=0;i<array.length;i++){
                if(numbers.startsWith(array[i])){
                    answer += Integer.toString(i);
                    idx = i;
                    break;
                }
            }
            numbers = numbers.substring(array[idx].length());
        }
        
        
        return Long.parseLong(answer);
    }
}