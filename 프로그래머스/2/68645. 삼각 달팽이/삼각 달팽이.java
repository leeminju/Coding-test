class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int last = 0;
        
        for(int i=1;i<=n;i++){
            last += i;
        }
        
        int[] answer = new int[last];
        
        int num = 1;
        int x = 0;
        int y = 0;
        
        int startx = 0;
        int starty = 0;
        int endx = n;
        int endy = n;
        
        
        while(true){
            //위-> 아래(y축 고정)
            for(int i=startx;i<endx;i++){
                arr[i][y] = num++;
                x = i;
            }
            
            //왼쪽-> 오른쪽(x축 고정)
            y++;    
            for(int j=starty+1;j<endy;j++){
                arr[x][j] = num++;
                y = j;
            }
      
        
            //아래 -> 위(x, y 감소)
            y--;
            for(int i = x-1; i > startx ;i--){                 
                 arr[i][y--] = num++;                
            }
            
            y++;
            startx+=2;
            starty++;
            endx--;
            endy-=2;
            
            if(num > last)
                break;
        }
      
        num = 0;    
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 0){
                    break;
                }
                answer[num++] = arr[i][j];
            }
        }
        
        return answer;
    }
}