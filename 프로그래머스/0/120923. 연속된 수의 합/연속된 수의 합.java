class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
    
        int center = total/num;//중앙값
        int idx= (total%num == 0)? num/2 : num/2-1;//중앙값의 인덱스
        
        answer[idx]=center;//중앙값 배열에 저장
        
        int n = center;
        //중앙에서부터 0까지 숫자 감소
        for(int i = idx-1;i>=0;i--){
            answer[i] = --n;
        }
        
        n = center;
        //중앙에서부터 마지막까지 숫자 증가 
        for(int i = idx+1;i<num;i++){
            answer[i] = ++n;
        }
        
        return answer;
    }
}