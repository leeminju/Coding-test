class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len=p.length();
        long p_num = Long.parseLong(p);
        
        
        for(int i=0;i<t.length()-len+1;i++){
            long num =  Long.parseLong(t.substring(i,i+len));
            
            if(num <= p_num){
                answer++;
            }
        }
        
        return answer;
    }
}