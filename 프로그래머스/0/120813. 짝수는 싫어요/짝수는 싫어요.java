class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n/2 + n%2];
        answer[0] = 1;
        
        for(int i=1;i<answer.length;i++){
            answer[i] = answer[i-1]+2;
        }
        
        return answer;
    }
}