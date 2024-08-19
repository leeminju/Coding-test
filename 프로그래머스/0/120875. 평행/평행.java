class Solution {
    public int solution(int[][] dots) {
      
        if(is_parallel(dots[0],dots[1],dots[2],dots[3])){
            return 1;
        }
        
        if(is_parallel(dots[0],dots[2],dots[1],dots[3])){
            return 1;
        }
        
        if(is_parallel(dots[0],dots[3],dots[1],dots[2])){
            return 1;
        }
        
        
        return 0;
    }
    
    boolean is_parallel(int[] dot1,int[] dot2,int[] dot3,int[] dot4){
        //기울기 구하기 (dot1,dot2)  (dot3,dot4)
        double inclination1 =0;
        double inclination2 =0;
        
        if(dot1[0] < dot2[0]){
           inclination1 = (double)(dot2[1]-dot1[1])/(dot2[0]-dot1[0]);     
        }else if(dot1[0] > dot2[0]){
           inclination1 = (double)(dot1[1]-dot2[1])/(dot1[0]-dot2[0]);  
        }else{
            return false;
        }
        
        if(dot3[0] < dot4[0]){
           inclination2 = (double)(dot4[1]-dot3[1])/(dot4[0]-dot3[0]);     
        }else if(dot3[0] > dot4[0]){
           inclination2 = (double)(dot3[1]-dot4[1])/(dot3[0]-dot4[0]);  
        }else{
            return false;
        }
        
        if(inclination1 == inclination2){
            return true;
        }
        
        return false;
    }
}