import java.util.*;
class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        int N = cards.length;
        boolean[] opened = new boolean[N];
        int cnt = 1;// 오픈 한 상자의 수
        int next = cards[0]-1;//다음 열 상자의 번호
        opened[0] = true;//1번 상자 오픈
        
        //열었던 상자를 만나기 전까지
        while(!opened[next]){
            opened[next] = true;
            next = cards[next]-1;
            cnt++;
        }
        
        if(cnt == N){
            return 0;
        }
        
        sum += cnt;
        list.add(cnt);//상자그룹의 상자 수 저장
        
        while(true){
            if(sum == N)
                break;
            
            for(int i=1;i<N;i++){
                //아직 안열린 상자 찾기
                if(!opened[i]){
                    next = cards[i]-1;
                    opened[i] = true;//오픈 해버리기
                    cnt = 1;
                    break;
                }
            }
            
             //열었던 상자를 만나기 전까지
            while(!opened[next]){
                opened[next] = true;
                next = cards[next]-1;
                cnt++;
            }
            
            list.add(cnt);
            sum += cnt;
        }
        
        Collections.sort(list,Collections.reverseOrder());//내림차순 정렬
        
        return list.get(0) * list.get(1);
    }
}