import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        Queue<Integer[]> queue = new LinkedList<>();
        queue.offer(new Integer[]{0, 0});

        while (!queue.isEmpty()) {
            Integer[] node = queue.poll();
            int x = node[0];
            int y = node[1];
            
            if(x == n-1 && y== m-1){
                return maps[n - 1][m - 1];
            }

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                if (maps[nx][ny] == 0) {
                    continue;
                }

                if (maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[x][y] + 1;//방문처리
                    queue.offer(new Integer[]{nx, ny});
                }
            }
        }

        
        
        
        return -1;
    }
}