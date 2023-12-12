class Solution {
    public int[] solution(String[] park, String[] routes) {
        int w = park.length;
        int h = park[0].length();
        int[] start = new int[2];
        
        for(int i=0;i<park.length;i++){
            if(park[i].contains("S")){
                int j = park[i].indexOf("S");
                start = new int[]{i,j};
            }
        }
        
        for(String route:routes){
            String direction = route.split(" ")[0];
            int distance= Integer.parseInt(route.split(" ")[1]);
            int count = 1;
            boolean isOk = true;
            
            if(direction.equals("N")){
                
                if(start[0] - distance >= 0){
                    while(count <= distance){
                        if(park[start[0]-count].charAt(start[1]) == 'X'){
                            isOk=false;
                            break;
                        }
                        count++;
                    }
                    
                    if(isOk){
                        start[0] -= distance;
                    }
                }    
            }else if(direction.equals("S")){
                 if(start[0] + distance < w){
                    while(count <= distance){
                        if(park[start[0]+count].charAt(start[1]) == 'X'){
                            isOk=false;
                            break;
                        }
                        count++;
                    }
                    
                    if(isOk){
                        start[0] += distance;
                    }
                } 
            }else if(direction.equals("W")){
                 if(start[1] - distance >= 0){
                    while(count <= distance){
                        if(park[start[0]].charAt(start[1]-count) == 'X'){
                            isOk=false;
                            break;
                        }
                        count++;
                    }
                    
                    if(isOk){
                        start[1] -= distance;
                    }
                }    
            }else if(direction.equals("E")){
                if(start[1] + distance < h){
                    while(count <= distance){
                        if(park[start[0]].charAt(start[1]+count) == 'X'){
                            isOk = false;
                            break;
                        }
                        count++;
                    }
                    
                    if(isOk){
                        start[1] += distance;
                    }
                }
            }
            
            
        }
        
        
        
        return start;
    }
}