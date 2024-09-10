class Solution {
    public int solution(int storey) {
        int answer = 0;
        int digit = Integer.toString(storey).length();
        int count = 0;
        
            
         while(count <= digit){
            int r = (storey/(int)Math.pow(10,count)) % 10;
            
            if(r == 0){
                count++;
                 continue;
             }
        
            if(r < 5){
                // 하강
                answer += r;
                storey -= (Math.pow(10,count) * r); 
            }else if(r == 5){
                
                int up = (storey/(int)Math.pow(10,count+1)) % 10;
                
                answer += r;
                if(up < 5){
                    // 하강
                    storey -= (Math.pow(10,count) * r); 
                }else{     
                    //상승
                    storey += Math.pow(10,count) * (10 - r);
                }
            }else{
                // 상승
                 answer += (10 - r);
                 storey += Math.pow(10,count) * (10 - r);
            }
         
            if(storey == 0){
                break;
            }
        
            count++;
        }
           
        
        return answer;
    }
}