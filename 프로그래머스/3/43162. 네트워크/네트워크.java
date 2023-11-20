import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited= new boolean[n];
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(computers,i,visited);
                answer++;
            }
        }
        
        return answer;
    }
    
     private static void dfs(int[][] array, int v, boolean[] visited) {
        visited[v] = true;

        for (int i=0;i<array[v].length ; i++) {
            if (v!= i && array[v][i] == 1 &&   !visited[i]) {
                dfs(array, i, visited);
            }
        }

    }
    
}