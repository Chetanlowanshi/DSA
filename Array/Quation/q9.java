// Give an sorted array find the frequencey each element on the array
package Quation;
import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int arr[] = new int[n];
      int max = Integer.MIN_VALUE;
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max,arr[i]);
        }
         int size = max +1;
        
        int [] hash = new int[size];
         for(int i=0;i<n;i++){
            int index = arr[i];
            hash[index]++;
         }
        
         for(int i = 0; i<hash.length;i++){
            System.out.println(hash[i]);
          
         }
            
         sc.close();
    }
    
}
