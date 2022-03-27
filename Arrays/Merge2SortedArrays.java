// To merge two sorted arrays
// Time complexity: O(n)

import java.util.*;
public class Main{ 

  public static int[] mergedArrays(int[] arr1, int[] arr2){
    int len = arr1.length + arr2.length;
    int mergedArray[] = new int[len];
    int k=0;
    int i=0;
    int j=0;
    while((i<arr1.length) && (j<arr2.length)){
      if (arr1[i] < arr2[j]){
        mergedArray[k] = arr1[i];
        i++; k++;
      }
      else{
        mergedArray[k] = arr2[j];
        j++; k++;
      }
    }
    while (i<arr1.length)
      mergedArray[k++] = arr1[i++];
    while (j<arr2.length)
      mergedArray[k++] = arr2[j++];

    return mergedArray;
  }


  public static void main(String[] args){
    int[] arr1 = {1,2,3,4};
    int[] arr2 =  {4,5,7};
    int[] mergedArray = mergedArrays(arr1,arr2);
    System.out.println("Merged Array: ");
    for(int i=0; i<mergedArray.length; i++)
      System.out.print(mergedArray[i]+" ");
  }

  
}

