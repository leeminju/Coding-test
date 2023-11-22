import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int box = score.length/m;
        
        if(box == 0){
            return 0;
        }
        
        int not = score.length % m;
        Arrays.sort(score);
        
        for(int i=0;i<box;i++){
            answer += m * score[not + m * i];
        }
        
        return answer;
    }
}