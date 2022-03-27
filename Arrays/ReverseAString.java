// To reverse a string.
// Time complexity: O(n)

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = in.nextLine();
    int len = str.length();
    char newStr[] = new char[len];
    for(int i=0; i<str.length();i++){
      len--;
      char ch = str.charAt(i);
      newStr[len] = ch;
    }
    String revString = new String(newStr);
    System.out.println("Reversed String: "+revString);
    in.close();
  }
}
