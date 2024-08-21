class Solution {
    public int solution(int n, int m) {
        double result = 1;
        
        // n! / m! = (m+1)*(m+2)*...*n
        for(int i=m+1;i<=n;i++){
            result *= i;
        }
        
        // 위 결과를 (n-m)!로 나누기
        for(int i=2;i<=(n-m);i++){
            result /= i;
        }
        
        return (int)Math.round(result);
    }
}