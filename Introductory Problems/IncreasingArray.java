import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long arr[] =new long[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        long moves=0;
        for(int i =0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                long diff = arr[i] - arr[i+1];   // Calculates the number of moves needed.
                arr[i+1] = arr[i];
                moves+=diff;
            }

        }
        System.out.println(moves);
    } 
   
}
