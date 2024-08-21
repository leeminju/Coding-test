class Solution {
    public int solution(int n, int m) {
        double temp = 1;
        for(int i=m+1;i<=n;i++){
            temp *= i;
        }
        
 
        for(int i=2;i<=(n-m);i++){
            temp /= i;
        }
        
        return (int)Math.round(temp);
    }
}