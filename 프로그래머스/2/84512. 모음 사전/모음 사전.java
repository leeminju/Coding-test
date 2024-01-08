class Solution {
    int count = 0;
    static int answer = 9999999;
    public int solution(String word) {
        String[] alphabets = {"A","E","I","O","U"};
            
        dfs(alphabets,word,0,new StringBuilder(""));
    
        return answer;
    }
    
    void dfs(String[] alphabets,String target,int depth,StringBuilder str){
        if(depth == 5){
            return;
        }
        
        for(int i=0;i<alphabets.length;i++){
            str.append(alphabets[i]);
            count++;
            if(str.toString().equals(target)){
                answer = Math.min(answer,count);
                return;
            }

            dfs(alphabets,target,depth+1,str);
            str.deleteCharAt(str.length()-1);
        }
    }
}