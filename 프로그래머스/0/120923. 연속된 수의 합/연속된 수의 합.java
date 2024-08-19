class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int count = num;
        int center = total/num;
        int idx=num/2;
        if(total % num == 0){
            answer[idx] = center;
        }else{
            idx--;
            answer[idx]=center;
        }
        
        int n = center;
        for(int i = idx-1;i>=0;i--){
            answer[i] = --n;
        }
        
        n = center;
        for(int i = idx+1;i<num;i++){
            answer[i] = ++n;
        }
        
        return answer;
    }
}