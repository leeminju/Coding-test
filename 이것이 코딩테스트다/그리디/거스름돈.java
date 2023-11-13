import java.util.*;
public class 거스름돈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        Integer[] arr = {10,50,100,500};
        
        Arrays.sort(arr,Collections.reverseOrder());

        int answer = 0;
        for(int coin:arr){
            answer += N/coin;
            N %= coin;
        }
        System.out.println(answer);
    }
}
