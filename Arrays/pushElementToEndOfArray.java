// To push an item to the end of the array.
// Time complexity: O(1)

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter length of array: ");
    int len = in.nextInt();  
    int arr[] = new int[len+1];
    System.out.println("Enter items in array: ");
    for(int i=0; i<len;i++)
      arr[i] = in.nextInt();
    System.out.println("Enter element to be pushed: ");
    int el = in.nextInt();
    arr[len] = el;
    System.out.println("Final array:");
    for(int i=0;i<len+1;i++)
      System.out.print(arr[i]+" ");
    in.close();
  }
}
