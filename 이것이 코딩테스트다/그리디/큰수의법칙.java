import java.util.*;

class 큰수의법칙 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    
    int[] arr= new int[N];
    for(int i=0;i<N;i++){
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    int first = arr[N - 1];
    int second = arr[N - 2];

    int count =  M/(K+1) * K + M%(K+1);

    int answer = first * count + second * (M-count) ;

    System.out.println(answer);  
  
  }
}