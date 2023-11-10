import java.util.*;

class Solution {
    boolean[] visited;
    int answer = 0;
     public int solution(int[] number) {

        visited = new boolean[number.length];
        dfs(number, 0, 0, 0);
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