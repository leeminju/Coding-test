import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;// n과의 거리 최솟값
        Arrays.sort(array);
        
        for(int i=0;i<array.length;i++){
            int dis =Math.abs(array[i] - n);

            if(dis < min){
                min = dis;
                answer = array[i];
            }
        }
        
        return answer;
    }
}