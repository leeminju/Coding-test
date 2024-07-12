import java.util.*;

class Solution {
    List<Line> lines = new ArrayList<>();
    
    public int solution(String dirs) {
        int answer = 0;
        int x = 0;//가로
        int y = 0;//세로
        
     
        for(int i=0;i<dirs.length();i++){
            char dir = dirs.charAt(i);
            int preX = x;
            int preY = y;
            
            switch(dir){
                case 'U':
                    if(check(y+1))
                        y++;
                    break;
                case 'D':
                    if(check(y-1))
                        y--;
                    break;
                case 'R':
                    if(check(x+1))
                        x++;
                    break;
                case 'L':
                    if(check(x-1))
                        x--;
                    break;
            }
            
            if(preX == x && preY == y){
                continue;
            }
            
            if(!visited(preX,preY,x,y)){
                lines.add(new Line(preX,preY,x,y));
            }
        }
        
        return lines.size();
    }
    
    boolean check(int value){
        if(value< -5 || value >5){
            return false;
        }
        return true;
    }
    
    
    boolean visited(int x1,int y1,int x2,int y2){
        for(int i=0;i<lines.size();i++){
            Line line = lines.get(i);
            if(line.x1 == x1 && line.y1 == y1 && line.x2 == x2 && line.y2 == y2){
                return true;
            }
            
            if(line.x1 == x2 && line.y1 == y2 && line.x2 == x1 && line.y2 == y1){
                return true;
            }
        }
        
        return false;   
    }
    
    class Line{
        int x1,y1,x2,y2;
        public Line(int x1,int y1,int x2,int y2){
            this.x1=x1;
            this.y1=y1;
            this.x2=x2;
            this.y2=y2;
        }
    }
}