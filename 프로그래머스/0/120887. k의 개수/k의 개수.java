class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String K = Integer.toString(k);
        
        for(int num=i;num<=j;num++){
            String str=Integer.toString(num);
            
            if(!str.contains(K)){
                continue;
            }
            
            for(int x=0;x<str.length();x++){
                char c = str.charAt(x);
                if ( (int)(c - '0') == k){
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}