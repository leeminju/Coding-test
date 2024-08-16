class Solution {
    public int solution(int M, int N) {
        int min = Math.min(M,N);
        int max = Math.max(M,N);
        
        return (min - 1) + (min * (max-1));
    }
}