import java.util.*;

class Solution {
   
    
    public int solution(String s) {
        String ans = "";
        List<String> list = List.of("zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                ans += c;
                continue;
            }

            for (int j = 0; j <= 9; j++) {
                String word = list.get(j);
                if (i + word.length() > s.length())
                    continue;

                String temp = temp = s.substring(i, i + word.length());

                if (word.equals(temp)) {
                    ans += j;
                    i += word.length()-1;
                    break;
                }
            }
        }

        return Integer.parseInt(ans);
    }

}