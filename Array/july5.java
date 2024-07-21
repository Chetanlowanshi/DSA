public class july5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            int sum =0;
            for(int j=i ; j<n ; j++){
                // int sum =0;
                // for(int k=i; k<=j ; k++){
                //     // System.out.print(arr[k]+" ");
                //      sum+=arr[k];   // sum of the array in line 
                // }
                // System.out.println( );
                sum+=arr[j];
                if(sum>ans);
                ans=sum;
        
                // System.out.println(sum); // sum of the array in line 
            }
        }
        System.out.print(ans);
        
    }
   
        
    
}
//  O(n^3) time compleity