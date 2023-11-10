class Solution {
    public boolean solution(int x) {
        int sum= digitSum(x);
        return x % sum == 0 ? true : false;
    }
    
    int digitSum(int n){
        int sum=0;
        while(n > 0){
            sum +=n%10;
            n/=10;
        }
        return sum;
    }
}