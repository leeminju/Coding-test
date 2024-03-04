class Solution {
    int count = 0;
    public int solution(int[][] land) {
        int answer = 0;
        int n = land.length;
        int m = land[0].length;
        boolean[][] visited = new boolean[n][m];
        
        for(int i=0;i<m;i++){
            count = 0;
            visited = new boolean[n][m];
            for(int j=0;j<n;j++){
                if(land[j][i] == 1 && !visited[j][i]){
                    find(land,j,i,n,m,visited);
                }
            }
            answer=Math.max(answer,count);
        }
        
        
        return answer;
    }
    
    void find(int[][] land, int x,int y,int n,int m, boolean[][] visited){
        if(land[x][y]==0){
            return;
        }
        
        visited[x][y] = true;
        count++;
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        
        for(int i=0;i<4;i++){
            if(x+dx[i] < 0 || x+dx[i] >= n || y+dy[i] < 0 || y+dy[i] >=m || visited[x+dx[i]][y+dy[i]]){
                continue;
            }  
            
            find(land,x+dx[i],y+dy[i],n,m,visited);
        }
    }
}