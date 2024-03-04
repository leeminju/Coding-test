import java.util.*;
class Solution {
    int n,m;
    int starty,endy;
    int[][] land;
    public int solution(int[][] land) {
        this.land = land;
        int answer = 0;
        n = land.length;//세로
        m = land[0].length;//가로
        int[] arr = new int[m];//시추관을 수직으로 뚫었을 때 위치 당 뽑을 수 잇는 석유량 
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(land[i][j] == 1){
                    starty= m;
                    endy = 0;
                    int count = find(i,j,-1);
                    //연결된 덩어리에 0,1이 아닌 값(-1)을 바꿔주고 한 덩어리의 크기 계산
                    
                    // 덩어리의 가로 시작부터 끝까지 
                    for(int k=starty;k<=endy;k++){
                        arr[k] += count;
                    }
                }
            }
        }
        
        for(int i=0;i<m;i++){
            answer = Math.max(answer,arr[i]);
        }
        
        
        return answer;
    }
    
    int find(int x,int y,int value){        
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        int count = 1;
        land[x][y] = value;
        starty = Math.min(starty,y);
        endy= Math.max(endy,y);
    
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        
        while(!q.isEmpty()){
            int[] node= q.poll();
            int cx = node[0];
            int cy = node[1];
            starty = Math.min(starty,cy);
            endy= Math.max(endy,cy);// 덩어리의 가로 끝 위치 저장
            
            //현재 위치에서 상하좌우로 이동한다.
            for(int i=0;i<4;i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= n || ny >= m){
                    continue;
                }
                
                if(land[nx][ny] != 1)
                    continue;
                
                q.offer(new int[]{nx,ny});
                land[nx][ny] = value;
                count++;// 덩어리의 크기 증가
            }
        }
        
        return count;
    }
}