class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int minx = 51;
        int maxx = -1;
        int miny = 51;
        int maxy = -1;
        
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j) == '#'){
                    minx = Math.min(minx,i);
                    maxx = Math.max(maxx,i);
                    miny = Math.min(miny,j);
                    maxy = Math.max(maxy,j);
                }
            }
        }
        answer[0]=minx;
        answer[1]=miny;
        answer[2]=maxx+1;
        answer[3]=maxy+1;
    
        
        return answer;
    }
}