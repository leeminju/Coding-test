class Solution {
    boolean[] visited;
    int answer = 0;
     public int solution(int[] number) {

        for(int i=0; i<number.length-2; i++){
            for(int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k]==0) answer++;
                }
            }
        }

         
     //   visited = new boolean[number.length];
    //    dfs(number, 0, 0, 0);
        return answer;
    }

    void dfs(int[] arr, int cnt, int sum, int index) {
        if (cnt == 3) {
            if (sum == 0) {
                answer++;
            }
            return;
        }


        for (int i = 0; i < arr.length; i++) {
            if (!visited[i] && i >= index) {
                visited[i] = true;
                dfs(arr, cnt + 1, sum + arr[i], i);
                visited[i] = false;
            }
        }
    }
}