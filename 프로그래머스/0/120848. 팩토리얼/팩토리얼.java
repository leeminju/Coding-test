class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n <= 2)
            return n;
        int[] f = new int[11];
        
        f[0]=0;
        f[1]=1;
        f[2]=2;
        
        for(int i=3;i<=10;i++){
            f[i] = f[i-1] * i;

            if(n < f[i]){
                answer = i-1;
                break;
            }else if(n == f[i]){
                answer = i;
                break;
            }
        }
        
        
        return answer;
    }
}