class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int length = section.length;
        
        for(int i=0;i<length;i++){    
            answer++;
            int last = section[i] + m -1;// 롤러를 한 번 칠할 때(m미터 만큼) 끝에 구역
    
            while(i+1 < length && section[i+1] <= last){
                i++;
            }
 
        }
        
        return answer;
    }
}