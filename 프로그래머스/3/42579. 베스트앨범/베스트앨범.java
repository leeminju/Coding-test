import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer={};
        int idx = 0;
        //장르 별로 가장 많이 재생된 노래를 두 개씩
        Map<Integer,Song> map1 = new HashMap();//고유 번호, Song 객체
        Map<String,Integer> map2 = new HashMap();// 장르, 재생수
        
        for(int i=0;i<genres.length;i++){
            map1.put(i,new Song(i,genres[i],plays[i]));
            map2.put(genres[i],map2.getOrDefault(genres[i],0)+plays[i]);
        }
        
        
        List<Map.Entry<Integer, Song>> songList = new LinkedList<>(map1.entrySet());
        songList.sort(new Comparator<Map.Entry<Integer,Song>>(){
             @Override
            public int compare(Map.Entry<Integer,Song> o1, Map.Entry<Integer,Song> o2) {
	            Song s1 = o1.getValue();
                Song s2 = o2.getValue();
                if(s1.play == s2.play){
                    return s1.num - s2.num;
                }else{
                    return s2.play - s1.play;
                }
            }
        });// 곡의 정렬 기준 따른다.
        
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map2.entrySet());
        entryList.sort((o1,o2)->o2.getValue()-o1.getValue());//장르별 재생 수 내림차 순 정렬
        
        
        ArrayList<Integer> array = new ArrayList<>();
        
        for(Map.Entry<String,Integer> entry : entryList){
            int count = 0;
            String genre= entry.getKey();
            
            for(Map.Entry<Integer,Song> entry2 : songList){
                Song s = entry2.getValue();
                if(count == 2){
                    break;
                }
                if(genre.equals(s.genre)){
                    array.add(s.num);
                    count++;
                }
            }
        }
        
        answer = new int[array.size()];;
        for(int i=0;i<array.size();i++){
            answer[i]=array.get(i);
        }
        
        return answer;
    }
}
class Song{
    int num;//고유 번호
    String genre;//장르
    int play;//재생수
    
    public Song(int num,String genre,int play){
        this.num = num;
        this.genre=genre;
        this.play = play;
    }
}