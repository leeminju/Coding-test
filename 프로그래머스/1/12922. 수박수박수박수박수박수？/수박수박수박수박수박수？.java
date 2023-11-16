class Solution {
    public String solution(int n) {
        String answer = "";
        
        
        int q = n/2;
        int r = n%2;
        answer += "수박".repeat(q);
        answer += "수".repeat(r);
        
        
        return answer;
    }
}