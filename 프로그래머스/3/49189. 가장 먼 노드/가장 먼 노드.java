
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
    
        
        while(!q.isEmpty()) { // 큐가 비어있지 않다면
            // 가장 최단 거리가 짧은 노드에 대한 정보 꺼내기
            Node node = q.poll(); // 현재 노드
            int now = node.getIndex();
            if(visited[now]){
                continue;
            }
            visited[now] = true;
            
            // 현재 노드와 연결된 다른 인접한 노드들을 확인
            for (int i = 0; i < graph.get(now).size(); i++) {
                int cost = d[now] + 1;
                int next = graph.get(now).get(i);
                // 현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
                if (cost < d[next] && !visited[next]) {
                    d[next] = cost;
                    q.offer(new Node(next,cost));
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