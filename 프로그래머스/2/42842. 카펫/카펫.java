class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int xy = yellow;
        int sum = (brown - 4)/2;
        
        for(int i=1;i <= sum/2 ; i++){
            int y = i;
            int x = sum - i;   
            if(x * y == xy){
                answer[0] = x+2;
                answer[1] = y+2;
                return answer;
            }
        }
        
        return answer;
    }
}