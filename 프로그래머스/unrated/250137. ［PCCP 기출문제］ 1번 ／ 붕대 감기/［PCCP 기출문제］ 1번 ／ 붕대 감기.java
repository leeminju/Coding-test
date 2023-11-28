class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int combo=0;
        int idx = 0; 
        int h=health;
        
        int last_time = attacks[attacks.length-1][0];
        
        for(int t=1;t<=last_time;t++){
            //공격 시간 일때
            if(t == attacks[idx][0]){
                combo=0;
                h -= attacks[idx][1];
                
                if(h <= 0)
                    break;
                idx++;
            }else{
                combo++;
                h = Math.min(health, h+bandage[1]);
                
                if(combo == bandage[0]){
                    h = Math.min(health, h+bandage[2]);
                    combo = 0;
                }
            }
        }
        
        if(h <= 0){
            return -1;
        }else{
            return h;
        }
    }
}