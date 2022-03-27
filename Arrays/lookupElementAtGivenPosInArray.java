// To lookup items at a given index in an array
// Time complexity: O(1)

import java.util.*;
public class lookup{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter length of array: ");
    int len = in.nextInt();
    int arr[] = new int[len];
    System.out.println("Enter items in array: ");
    for(int i=0; i<len;i++)
      arr[i] = in.nextInt();
    System.out.print("Enter index to lookup: ");
    int ind = in.nextInt();
    System.out.println("Value at index "+ind+" is "+arr[ind]);
    in.close();
  }
}
