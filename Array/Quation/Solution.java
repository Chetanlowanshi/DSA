
package Quation;

import java.util.*;

public class Solution {


  public int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += nums[i];
    }
    int total = (n * (n + 1)) / 2;
    return total - sum;
}

   
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        int[] nums = {0,1,2,3,4,5,6,7,8};
        System.out.println(solution.missingNumber(nums));
       

      }
      
  



    }



    

