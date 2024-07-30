class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n<4)
            return 0;
        
        for(int i=4;i<=n;i++){
            if(numberofdivisors(i) >= 3){
                answer++;
            }
        }
        
        return answer;
    }
    
    private int numberofdivisors(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if( n%i == 0 )
                count++;
        }    
        return count;
    }
}   