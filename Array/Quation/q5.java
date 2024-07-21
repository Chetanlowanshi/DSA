package Quation;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System .in);
         int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }  

        // int k=sc.nextInt();
        // k%=n;

        // for(int i = 0; i<k;i++){
        //     int temp = arr[0];
        //     for(int i =n-1 ; i>=1; i++){
        //       arr[i] = arr[i+1];
        //     }
        //     arr[n-1]= temp;
        // }
        
        sc.close();
    }
    
}
