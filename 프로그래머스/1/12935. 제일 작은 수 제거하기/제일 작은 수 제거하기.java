import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length == 1){
            return new int[]{-1};
        }else{
            answer = new int[arr.length-1];
        }
        
        int[] original=arr.clone();
        
        Arrays.sort(arr);
        int min = arr[0];
        int cnt=0;
        
        for(int i=0;i<original.length;i++){
            if(original[i] != min){
                answer[cnt++] = original[i];
            }
        }
        
        return answer;
    }
}