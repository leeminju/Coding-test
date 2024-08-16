class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        int num = 1;
        
        while(n >= num){
            String str = Integer.toString(i);
            
            if(str.contains("3")){
                i++;
                continue;   
            }
            if(i%3 == 0){
                i++;
                continue;
            }
            
            if(n == num){
                return i;
            }
            num++;
            i++;
        }
        
        return answer;
    }
}