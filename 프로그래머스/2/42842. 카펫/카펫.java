class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int xy = yellow;
        int sum = (brown - 4)/2;
        
        System.out.println(xy);
        System.out.println(sum);
        
        for(int i=1;i <= sum/2 ; i++){
            int x = i;
            int y = sum - i;   
            if(x * y == xy){
                answer[0] = y+2;
                answer[1] = x+2;
                return answer;
            }
        }
        
        return answer;
    }
}