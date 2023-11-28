class Solution {
    public int solution(int a, int b) {
        int gcd = gcd(a,b); // 최대공약수 구하기
        b /= gcd;
 
        //소인수 - 주어진 자연수를 나누어 떨어뜨리는 약수 중에서 소수인 약수
        
        for(int i=2;i<=b;i++){
            if(b % i == 0 && isPrimeNumber(i)){
                if(i != 2 && i != 5){
                    return 2;
                }   
            }
        }
            
        return 1;
    }
    
    boolean isPrimeNumber(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    int gcd(int a,int b){
        int min = Math.min(a,b);
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
               return i; 
            }
        }
        return 1;
    }
}