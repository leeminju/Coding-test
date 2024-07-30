class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] answer = new int[n];
        
        if(direction.equals("left")){
            
            for(int i=0;i<n-1;i++){
                answer[i] = numbers[i+1];
            }
            answer[n-1] = numbers[0];
            
        }else{
            
            answer[0] = numbers[n-1];
            for(int i=1;i<n;i++){
                answer[i] = numbers[i-1];
            }
            
        }
        
        return answer;
    }
}