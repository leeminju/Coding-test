class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx=0;
        
        for(int i=0;i<picture.length;i++){
            String line = picture[i];
            String newLine = "";
            for(int j=0;j<line.length();j++){
                char c = line.charAt(j);
                newLine += Character.toString(c).repeat(k);
            }
            int count =0;
            
            while(count < k){
                answer[idx++] = newLine;
                count++;
            }
        }
        return answer;
    }
}