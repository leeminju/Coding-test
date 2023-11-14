import java.util.*;

class Solution {
   
    public int solution(String s) {
        String ans = "";
        String[] array = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};

        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                ans += c;
                i++;
                continue;
            }

            for (int j = 0; j <= 9; j++) {
                String word = array[j];
                if (i + word.length() > s.length())
                    continue;

                String temp = temp = s.substring(i, i + word.length());

                if (word.equals(temp)) {
                    ans += j;
                    i += word.length();
                    break;
                }
            }
        }

        return Integer.parseInt(ans);
    }

}