import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];//이때, 당첨 가능한 최고 순위와 최저 순위
        int[] rank = {6,6,5,4,3,2,1};
        int count = 0;
        int zero = 0;
        ArrayList<Integer> winList = new ArrayList<>();
        
        for(int i=0;i<6;i++){
            winList.add(win_nums[i]);
        }
        
        for(int i=0;i<6;i++){
            if(lottos[i] == 0){
                zero++;
            }else if(winList.contains(lottos[i])){
                count++;
            }
        }
        
        answer[0]=rank[count+zero];
        answer[1]=rank[count];
        
        
        return answer;
    }
}