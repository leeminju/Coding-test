
class Solution {
    public int solution(int n) {
        int gcd = gcd(6,n);        

        return n/gcd;
    }
    
    private int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}