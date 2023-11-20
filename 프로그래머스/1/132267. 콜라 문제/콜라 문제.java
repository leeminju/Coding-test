class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            answer += (n / a) * b;// 새 콜라 받음
            n = (n / a) * b + n % a;// (받은 콜라) + (남은 빈병)
        }
        
        return answer;
    }
}