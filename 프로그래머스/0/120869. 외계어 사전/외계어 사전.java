class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        for(String word:dic){
            boolean flag=true;
            int[] spell_count = new int[spell.length];
            
            for(int i=0;i<word.length();i++){
                int c = word.charAt(i);
                int idx = spell_idx(spell,Character.toString(c));
                
                //spell에 존재하지 않은 알파벳
                if(idx == -1){
                    continue;
                }
                
                spell_count[idx]++;
            }
            
            if(is_all_one(spell_count)){
                return 1;
            }
        }
        
        return 2;
    }
    
    int spell_idx(String[] spell,String c){
        for(int i=0;i<spell.length;i++){
            if(spell[i].equals(c)){
                return i;
            }
        }
        return -1;
    }
    
    boolean is_all_one(int[] spell_count){
        for(int i=0;i<spell_count.length;i++){
            if(spell_count[i]!=1){
                return false;
            }
        }
        return true;
    }
}