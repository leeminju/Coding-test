import java.util.*;

class 숫자카드게임 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int max = 0;
    for(int i=0;i<N;i++){
      int min = 10001;
      for(int j=0;j<M;j++){
        int num = sc.nextInt();
        min = Math.min(min,num);
      }
      max = Math.max(max,min);
    }

    System.out.println(max);
  
  }
}