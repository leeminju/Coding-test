import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        Queue<Integer[]> queue = new LinkedList<>();
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;

        //0은 벽이 있는 자리, 1은 벽이 없는 자리를 나타냅니다.
        //처음에 캐릭터는 게임 맵의 좌측 상단인 (1, 1)->0,0 위치에 있으며
        //상대방 진영은 게임 맵의 우측 하단인 (n, m)->n-1,m-1 위치에 있습니다.
        queue.add(new Integer[]{0,0,1});
        
        while(true){
            Integer[] node=queue.poll();
            int x=node[0];
            int y=node[1];
            int cnt = node[2];
            
            if(x == n-1 && y== m-1){
                answer = cnt;
                break;
            }
            
            for(int i=0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || nx > n-1 || ny<0 || ny> m-1){
                    continue;
                }
                
                if(maps[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    queue.offer(new Integer[]{nx,ny,cnt+1});
                }
            }
            
            if(queue.isEmpty())
                return -1;
            
        }
        
        
        
        return answer;
    }
}