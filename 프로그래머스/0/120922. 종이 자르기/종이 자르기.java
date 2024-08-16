class Solution {
    public int solution(int M, int N) {
        int min = Math.min(M,N);
        int max = Math.max(M,N);
        
        if(M == 1 && N == 1){
            return 0;
        }
        
        return (min - 1) + (min * (max-1));
    }
}