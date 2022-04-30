package Mathematics;
import java.util.*;
public class sieve_of_eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the higher Range");
        int n = sc.nextInt();
        if(n<4){
            System.out.println("2" + "3");
        }else{
            boolean prime[] = new boolean[n];
            prime[0] = false;
            for(int i = 1; i<n; i++){
                prime[i] = true;
            }
            for(int i = 2; i <= Math.sqrt(n); i++){
                for(int j = 4; j <= n; j++){
                    if(j % i == 0){
                        prime[j-1] = false;
                    }
                }
            }

            for( int i = 1; i < n; i++){
                if(prime[i] == true){
                    System.out.print(i+1 + " ");
                }
            }
        }
       
    }
}
