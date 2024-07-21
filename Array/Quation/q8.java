// Give an unsorted array find the frequencey each element on the array

package Quation;
import java.util.*;
public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max_element=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max_element){
                max_element=arr[i];
            }
        }
        int size=max_element+1;
        int [] hash=new int[size];
        for(int i=0;i<n;i++){
            int index=arr[i];
            hash[index]++;
        }
        int max_freq=Integer.MIN_VALUE;
        for(int i=0;i<hash.length;i++){
        max_freq=Math.max(max_freq,hash[i]);
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]==max_freq){
                System.out.print("highest frequency :" +i);
            }
        }
  
            
         sc.close();
    }
    
}