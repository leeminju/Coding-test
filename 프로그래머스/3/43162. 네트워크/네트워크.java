import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        boolean[] visited = new boolean[n];
        
           // 그래프 초기화
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!= j && computers[i][j] == 1){
                    graph.get(i).add(j);
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(visited[i] == false){
                dfs(graph,i,visited);
                answer++;
            }
        }
        
        return answer;
    }
    
     private static void dfs(ArrayList<ArrayList<Integer>> graph, int v, boolean[] visited) {
        visited[v] = true;

        for (Integer node : graph.get(v)) {
            if (!visited[node]) {
                dfs(graph, node, visited);
            }
        }

    }
    
}