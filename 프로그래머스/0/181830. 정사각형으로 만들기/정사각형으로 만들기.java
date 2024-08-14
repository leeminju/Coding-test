class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer;
        
        int row = arr.length;//행 수
        int column =arr[0].length;//열 수
        
        if(row == column){
            return arr;
        }
        
        int max = Math.max(row,column);
        answer = new int[max][max];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}