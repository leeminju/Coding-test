class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n%2 == 1){
            //홀수
            return 홀수양의정수의합(n);
        }else{
            //짝수
            return 짝수양의정수의제곱의합(n);
        }
    }
    
    int 홀수양의정수의합(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum += i;
        }
        return sum;
    }
    
    int 짝수양의정수의제곱의합(int n){
        int sum=0;
        for(int i=2;i<=n;i+=2){
            sum += Math.pow(i,2);
        }
        return sum;
    }
    
}