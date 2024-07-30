class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int num:array){
            answer += count7(num);
        }
        
        return answer;
    }
    
    private int count7(int num){
        int count=0;
        while(num > 0){
            int n = num % 10;
            if(n == 7)
                count++;
            num /= 10;
        }
        return count;
    }
}