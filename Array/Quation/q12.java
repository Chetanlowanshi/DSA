package Quation;
import java.util.*;
public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


      
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
         }
         HashMap<Integer,Integer> map= new HashMap<> ();
         for(int i=0;i<n;i++){
         if(map.containsKey(arr[i])){
         int value=map.get(arr[i]);
         map.put(arr[i],value+1);
         }
        //  int max = Integer.MIN_VALUE;
        //  for(Map.Entry<Integer>e:map.entrySet());{
        //     max = Math.max(max, e.getValue);
            
         } 

         }
    }

















