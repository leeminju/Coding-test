class Solution {
    static int xmax;
    static int ymax;
    public int[] solution(String[] keyinput, int[] board) {
        xmax = board[0]/2;
        ymax = board[1]/2;
        int[] pos = new int[]{0,0};
        
        for(String key:keyinput){            
            if(key.equals("left")){
              if(!is_out(pos[0]-1,pos[1])){
                 pos[0]--; 
              }  
            }else if(key.equals("right")){
              if(!is_out(pos[0]+1,pos[1])){
                 pos[0]++; 
              } 
            }else if(key.equals("up")){
              if(!is_out(pos[0],pos[1]+1)){
                 pos[1]++; 
              }   
            }else if(key.equals("down")){
               if(!is_out(pos[0],pos[1]-1)){
                 pos[1]--; 
              }    
            }
        }
        
        return pos;
    }
    
    boolean is_out(int x,int y){
        if(x < (-1) * xmax || x > xmax || y < (-1) * ymax || y > ymax ){
            return true;
        }
        return false;
    }
}