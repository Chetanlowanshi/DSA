
import java.util.Scanner;
public class july1 {
    public static void main(String[] args) {
        
        
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int arr[]= new int[size];
            for(int i=0 ; i<size ; i++){
                arr[i]=sc.nextInt();
    
            }
            int ans =0;
            for(int i=0; i<size ; i++){
                if(arr[i]>ans)
                ans = arr[i];
            }
            System.out.println(ans);
                
        sc.close();
    }
   
    }
    

