import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Arrays.sort(lines, (o1,o2)->((o1[0]-o2[0]!=0)?o1[0]-o2[0]:o1[1]-o2[1]));
        
        int[] one = lines[0];
        int[] two = lines[1];
        int[] three = lines[2];
        
        int[] ans1 = new int[2];
        int[] ans2 = new int[2];
        int[] ans3 = new int[2];
        
        boolean flag1=false,flag2=false,flag3=false;
        
        // one vs two
        if(one[1] > two[0]){
            //겹친다.
            flag1=true;
            ans1 = new int[]{two[0],Math.min(two[1],one[1])};
        }
        
        // one vs three
        if(one[1] > three[0]){
            flag2 = true;
            ans2 = new int[]{three[0],Math.min(three[1],one[1])};
        }

         // two vs three
        if(two[1] > three[0]){
            flag3 = true;
            ans3 = new int[]{three[0],Math.min(three[1],two[1])};
        }
        //겹치는 부분이 없음
        if(!flag1 && !flag2 &&!flag3)
        {
            return 0;
            //겹치는 부분이 3군데
        }else if(flag1 && flag2 && flag3){
            int[][] overlap = {ans1,ans2,ans3}; 
            return calculate(overlap);
            //겹치는 부분이 2군데
        }else if(flag1 && flag2 && !flag3){
            int[][] overlap = {ans1,ans2};
            return calculate(overlap);   
        }else if(flag1 && !flag2 && flag3){
            int[][] overlap = {ans1,ans3}; 
            return calculate(overlap);   
        }else if(!flag1 && flag2 && flag3){
            int[][] overlap = {ans2,ans3};
            return calculate(overlap);   
            // 겹치는 부분이 1군데
        }else if(flag1 && !flag2 && !flag3){
            return ans1[1]-ans1[0];
        }else if(!flag1 && flag2 && !flag3){
            return ans2[1]-ans2[0];
        }else if(!flag1 && !flag2 && flag3){
            return ans3[1]-ans3[0];
        }
        
        return 0;
    }
    
    int calculate(int[][] overlap){
        int answer = 0;
        Arrays.sort(overlap, (o1,o2)->((o1[0]-o2[0]!=0)?o1[0]-o2[0]:o1[1]-o2[1]));
        int[] ans= new int[2];
        
        int[] one = overlap[0];
        int[] two = overlap[1];
        boolean flag = false;
        
        if(one[1] > two[0]){
            flag= true;
            ans = new int[]{one[0],Math.max(two[1],one[1])};//연결하기
            answer = ans[1]- ans[0];
            
        }else{
            //겹치는 부분 없음
            answer += (one[1]-one[0]) +(two[1] - two[0]);
        }
        
        if(overlap.length == 2){
            return answer;
        }
        
        int[] three=overlap[2];
        
        if(flag){
            //ans 와 three 비교
            if(ans[1] > three[0]){
                ans = new int[]{ans[0],Math.max(three[1],ans[1])};//연결하기
                return ans[1] - ans[0];
            }else{
                //겹치는 부분 없음
                return (three[1]-three[0]) + (ans[1] - ans[0]);
            }   
        }else{
            //two 와 three 비교
            if(two[1] > three[0]){
                ans = new int[]{two[0],Math.max(two[1],three[1])};
                answer = (one[1]-one[0])+(ans[1]- ans[0]);
                return answer;
            }else{
                //겹치는 부분 없음
                answer += (three[1]-three[0]);
                return answer;
            }
        }
    }
}