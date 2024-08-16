import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String,String> map = new HashMap<>();//아이디, 비밀번호 저장
        
        for(String[] data:db){
            map.put(data[0],data[1]);
        }
        
        if(!map.containsKey(id_pw[0])){
            return "fail";
        }
        
        String pw = map.get(id_pw[0]);
        
        if(pw.equals(id_pw[1])){
            return "login";
        }else{
            return "wrong pw";
        }

    }
}