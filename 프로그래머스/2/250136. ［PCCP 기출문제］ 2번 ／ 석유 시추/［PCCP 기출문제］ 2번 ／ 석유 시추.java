import java.util.*;
class Solution {

    int n,m;
    int starty = 500;
    int endy = -1;
    int count = 0;
    public int solution(int[][] land) {
        int answer = 0;
        n = land.length;//세로
        m = land[0].length;//가로
        int index = 2;
        int[] arr = new int[m];//시추관을 수직으로 뚫었을 때 위치 당 뽑을 수 잇는 석유량 
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(land[i][j] == 1){
                    count = 0;
                    starty= m-1;
                    endy = 0;
                    find(land,i,j,index);//연결된 덩어리에 같은 숫자(1이 아닌 숫자)로 값을 바꿔주고 한 덩어리의 크기 계산
                    
                    // 덩어리의 가로 시작부터 끝까지 
                    for(int k=starty;k<=endy;k++){
                        arr[k] += count;
                    }
                    index++;// 다음 덩어리는 증가된 숫자 저장되게함(중복 방지)
                }
            }
        }
        
        for(int i=0;i<m;i++){
            answer = Math.max(answer,arr[i]);
        }
        
        
        return answer;
    }
    
    void find(int[][] land, int x,int y,int value){        
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        
        while(!q.isEmpty()){
            int[] node= q.poll();
            int cx = node[0];
            int cy = node[1];
            
            if(land[cx][cy] != 1)
                continue;
                    
            starty= Math.min(starty,cy);// 덩어리의 가로 시작 위치 저장
            endy= Math.max(endy,cy);// 덩어리의 가로 끝 위치 저장
            land[cx][cy] = value;// 같은 덩어리는 모두 같은 값으로 바꾼다(1이 아닌 숫자)
            count++;// 덩어리의 크기 증가
        
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
            }
        }
        
        
    }
}