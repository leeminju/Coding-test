class Solution {
    int[][] board;
    int n;
    public int solution(int[][] board) {
        int answer = 0;            
        this.n = board.length;
        this.board = board;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 1){
                    // 위험지역 표시
                    mark_danger_area(i-1,j-1);
                    mark_danger_area(i-1,j);
                    mark_danger_area(i-1,j+1);

                    mark_danger_area(i,j-1);
                    mark_danger_area(i,j+1);
                    
                    mark_danger_area(i+1,j-1);
                    mark_danger_area(i+1,j);
                    mark_danger_area(i+1,j+1);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0)
                    answer++;
            }
        }

        return answer;
    }

    void mark_danger_area(int x,int y){
        if(x < 0 || x >= n || y < 0 || y >= n){
            return;
        }
        if(board[x][y] != 1)
            board[x][y] = 2;
    }
}