import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        
        for(int[] dot : dots){
            int x = dot[0];
            int y = dot[1];
            
            xSet.add(x);
            ySet.add(y);
        }
        
        int xmin = Collections.min(xSet);
        int xmax = Collections.max(xSet);
        int ymin = Collections.min(ySet);
        int ymax = Collections.max(ySet);
        
        
        return (xmax-xmin)*(ymax-ymin);
    }
}