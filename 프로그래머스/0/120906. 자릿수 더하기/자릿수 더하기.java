class Solution {
    public int solution(int n) {
        int answer = 0;
        String string = Integer.toString(n);
        for(int i=0;i<string.length();i++){
            answer += string.charAt(i)-'0';
        }
        
        return answer;
    }
}