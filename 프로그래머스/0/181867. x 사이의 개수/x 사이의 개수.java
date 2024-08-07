class Solution {
    public int[] solution(String myString) {
        String[] arr=myString.split("x");
        int[] answer;
        
        if(myString.charAt(myString.length()-1) != 'x')
            answer = new int[arr.length];
        else
            answer = new int[arr.length+1];
        
        
        for(int i=0;i<arr.length;i++){
            answer[i]=arr[i].length();
        }
        
        return answer;
    }
}