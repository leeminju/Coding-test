import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Map<Character,Integer> map = new HashMap();
        
        for(int i=0;i<skill.length();i++){
            map.put(skill.charAt(i),i);
        }
        
        for(String skill_tree:skill_trees){
            int level = 0;
            boolean check = true;
            for(int i=0;i<skill_tree.length();i++){
                char s = skill_tree.charAt(i);
                if(skill.contains(Character.toString(s))){
                    if(map.get(s) != level){
                        check = false;
                        break;
                    }
                    else
                        level++;
                }
            }
            
      
            if(check)
                answer++;
        }
        
        return answer;
    }
}