
class Solution {
    public String solution(int[] food) {
        String answer = "";
        String front = "";
        
        for(int i = 1;i < food.length;i++){
            front += Integer.toString(i).repeat(food[i]/2);
        }
        answer = front+"0"+new StringBuilder(front).reverse();
        
        return answer;
    }
}