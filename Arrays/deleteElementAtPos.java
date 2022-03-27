// To delete an element from a given location in the array
// Time complexity: O(n)

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter length of array: ");
    int len = in.nextInt();  
    int arr[] = new int[len];
    System.out.println("Enter items in array: ");
    for(int i=0; i<len;i++)
      arr[i] = in.nextInt();
    System.out.print("Enter index for element to be deleted: ");
    int ind = in.nextInt();
    for(int i=ind-1;i<len-1;i++)
      arr[i] = arr[i+1];
    len--;
    System.out.println("Final array:");
    for(int i=0;i<len;i++)
      System.out.print(arr[i]+" ");
    in.close();
  }
}
