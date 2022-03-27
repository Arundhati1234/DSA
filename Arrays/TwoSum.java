// https://leetcode.com/problems/two-sum/
// Time complexity: O(n)

import java.util.*;
public class Main{ 
    public static int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> hs = new HashMap<>();
        int complement;
        for (int i = 0; i< nums.length; i++){
            complement = target - nums[i];
            if (hs.containsKey(complement)){
                return new int[] {hs.get(complement),i};
            }
            else{
                hs.put(nums[i],i);
            }
        }
        return new int[] {};
    }



  public static void main(String[] args){
    int[] arr1 = {2,7,11,15};
    int[] indices = twoSum(arr1,18);
    System.out.println("Indices are:  ["+indices[0]+", "+indices[1]+"]");
    
    
  }

  
}

