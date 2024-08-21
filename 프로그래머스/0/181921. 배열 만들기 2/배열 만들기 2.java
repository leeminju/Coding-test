import java.util.*;
class Solution {
    List<Integer> list = new ArrayList<>();
    int l=0,r=0;
    public int[] solution(int l, int r) {
        int[] answer = {};
        this.l=l;
        this.r=r;
        
        for(int i=Integer.toString(l).length();i<=Integer.toString(r).length();i++){
            dfs(i,"","5");
        }
        
        if(list.isEmpty()){
            return new int[]{-1};
        }
        
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
    
    void dfs(int n, String num, String plus){
        
        for(int i=0;i<n;i++){
            if(num.length() == i){
                num += plus;
                
                if(num.length() == n){
                    int new_num = Integer.parseInt(num);
                    if(new_num >=l && new_num <= r){
                        list.add(new_num);
                    }
                    return;
                }
        
                dfs(n,num,"0");
                dfs(n,num,"5");
                
                num = num.substring(0,num.length()-1);
            }
        }
    }
}