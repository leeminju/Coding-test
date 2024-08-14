class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int xmin = 0;
        int ymin = 0;
        int xmax = n;
        int ymax = n;
        int count = 0;
        
        while(true){
            
            //위 가로줄
            for(int j=ymin;j<ymax;j++){
                answer[xmin][j] = num++;
                if(num == n*n +1)
                    return answer;
            }
            
            //오른쪽 세로줄
            for(int i=xmin+1;i<xmax;i++){
                answer[i][ymax-1] = num++;
                if(num == n*n +1)
                    return answer;
            }
            
            //아래 가로줄
            for(int j=ymax-2;j>=ymin;j--){
                answer[xmax-1][j] = num++;
                if(num == n*n +1)
                    return answer;
            }
            //왼쪽 세로줄
            for(int i=xmax-2;i>xmin;i--){
                answer[i][ymin] = num++;
                if(num == n*n +1)
                    return answer;
            }
            
            xmin++;
            ymin++;
            xmax--;
            ymax--;
    
        }
    }
}