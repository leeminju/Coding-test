class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
     
        int combo=0;
        int idx = 0; 
        int h=health;
        
        // attacks는 공격 시간을 기준으로 오름차순 정렬된 상태
        int last_time = attacks[attacks.length-1][0];// 마지막 공격 시간
        
        for(int i=1;i<=last_time;i++){
            // attacks[i]는 [공격 시간, 피해량] 

            //몬스터가 공격 시간 일때
            if(i == attacks[idx][0]){
                combo=0;// 연속 성공 시간이 0으로 초기화
                h -= attacks[idx][1];
                // 몬스터의 공격을 받으면 정해진 피해량만큼 현재 체력이 줄어듭니다
                
                if(h <= 0)// 캐릭터의 체력이 0 이하가 되어 죽는다 -> -1
                    return -1;
                idx++;
            }else{
                // bandage = {붕대 감기 기술의 시전 시간(t), 1초당 회복량(x), 추가 회복량(y) }
                
                combo++;// combo초 연속으로 붕대를 감는 데 성공한다면 
                h = Math.min(health, h+bandage[1]);
                // 현재 체력이 최대 체력보다 커지는 것은 불가능합니다.
                
                if(combo == bandage[0]){
                    h = Math.min(health, h+bandage[2]); 
                    // 현재 체력이 최대 체력보다 커지는 것은 불가능합니다.
                    // t초 연속으로 붕대를 감는 데 성공한다면 y만큼의 체력을 추가로 회복합니다
                    
                    combo = 0;// 연속 성공 시간이 0으로 초기화
                }
            }
        }
        
        //몬스터의 공격을 받고 캐릭터의 체력이 0 이하가 되어 죽는다 -> -1
      //  if(h <= 0){ 
    //        return -1;
     //   }else{
            return h; //모든 공격이 끝난 직후 남은 체력
     //   }
    }
}