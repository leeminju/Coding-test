class Solution {
     int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,0,target,0);
        return answer;
    }
    void dfs(int[] array,int idx, int target, int sum){
        if(idx == array.length){
            if(target == sum)
                answer++;
            return;
        }
        dfs(array,idx+1,target,sum+array[idx]);
        dfs(array,idx+1,target,sum-array[idx]);
        
    }
}