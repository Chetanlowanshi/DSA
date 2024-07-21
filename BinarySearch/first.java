// Binary Search code


package BinarySearch;
import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i= 0 ;  i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int ans = -1;
        int i = 0, j =n-1;
        while ( i<=j) {
            int mid = (i+j)/2;
           if (key ==arr[mid]){
            ans = mid;
            break ;
           }
           else if(key>arr[mid]){
            i = mid+1;
           }
           else{
            j =mid-1;
           }
            
        }
        System.out.println(ans);

        
    }
    
}
