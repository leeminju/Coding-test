class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];//분자, 분모
        int numerator = 1;// 분자
        int denominator = 1;// 분모
        
        if(denom1 != denom2){
            denominator = denom1 * denom2;
            numerator = numer1*denom2 + numer2*denom1; 
        }else{
            denominator = denom1;
            numerator = numer1 + numer2;
        }
        
        int gcd = gcd(numerator,denominator);
        if(gcd != 1){
            denominator /= gcd;
            numerator /= gcd;
        }
        
        answer[0] = numerator;
        answer[1] = denominator;
        
        return answer;
    }
    
    private static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}