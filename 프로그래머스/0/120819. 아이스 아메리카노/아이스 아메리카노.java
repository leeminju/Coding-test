class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];// 최대로 마실 수 있는 아메리카노 잔 수, 남는 돈
        answer[0] = money/5500;
        answer[1] = money - 5500 * answer[0];
        
        return answer;
    }
}