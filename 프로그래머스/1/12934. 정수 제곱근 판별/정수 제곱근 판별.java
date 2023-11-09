class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        long x = (long)sqrt;
        
        if(sqrt == x){
            return (long) Math.pow(x+1,2);
        }else{
            return -1;            
        }   
        
    }
}