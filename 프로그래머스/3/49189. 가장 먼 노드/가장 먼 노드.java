
import java.util.*;

class Node{
        private int index;
        private int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        public int getDistance() {
            return distance;
        }

        public int getIndex() {
            return index;
        }
}

class Solution {
    static final int INF = (int) 1e9;
    static List<List<Integer>> graph = new ArrayList<>();
        
    public int solution(int n, int[][] edge) {
        boolean[] visited = new boolean[n+1];
        int[] d = new int[n+1];
        Arrays.fill(d,INF);
        
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] e:edge){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(1, 0));
        d[1] = 0;
    
        
        while(!q.isEmpty()) { 
            Node node = q.poll(); // 현재 노드
            int now = node.getIndex();
            if(visited[now]){
                continue;
            }
            visited[now] = true;
            
            for (int i = 0; i < graph.get(now).size(); i++) {
                int distance = d[now] + 1;
                int next = graph.get(now).get(i);
                
                if (distance < d[next] && !visited[next]) {
                    d[next] = distance;
                    q.offer(new Node(next,distance));
                }
            }
        }
        
        int max = 0;
        int count = 0;
        
        for(int i=1;i<=n;i++){
            if(max < d[i]){
                count = 1;
                max = d[i];
            }else if(max == d[i]){
                count++;
            }
        }
        
        return count;
    }
}