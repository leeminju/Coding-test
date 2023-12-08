class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        
        String cur_color=board[h][w];
        
       if(h >= 1 && board[h-1][w].equals(cur_color)){
           answer++;
       }
             
        if(h +1 <= n-1 && board[h+1][w].equals(cur_color)){
           answer++;
       } 
       if(w >= 1 &&  board[h][w-1].equals(cur_color)){
           answer++;
       }
        
        if(w +1 <= n-1 && board[h][w+1].equals(cur_color)){
           answer++;
       } 
         
        
            
        return answer;
    }
}