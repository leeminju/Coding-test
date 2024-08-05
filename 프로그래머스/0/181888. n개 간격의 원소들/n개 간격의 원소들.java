class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length/n + ((num_list.length%n==0)?0:1)];
        int idx = 0;
        
        for(int i=0;i<answer.length;i++){
            answer[i]=num_list[idx];
            idx += n;
        }
        
        return answer;
    }
}