
class Solution {
    public int[] solution(int[] array) {
        int max = -1;//최댓값
        int index = -1;
        int[] answer = new int[2];
        
        for(int i=0;i<array.length;i++){
            if(array[i] > max){
                index = i;
                max= array[i];
            }
        }
        
        answer[0] = max;
        answer[1] = index;
        
        return answer;
    }
}