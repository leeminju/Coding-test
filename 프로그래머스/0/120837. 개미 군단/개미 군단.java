class Solution {
    public int solution(int hp) {
        int warlord = hp/5;//장군 개미
        
        hp -= warlord * 5;
        
        int soldier = hp/3;//병정 개미
        
        hp -= soldier * 3;
            
        return warlord+soldier+hp;
    }
}