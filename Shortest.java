import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        System.out.print("(");
        for(int i=0;i<3;i++)
        {
            char a=S.charAt(i);
        System.out.print(a);
        } 
        System.out.print(")");
        for(int j=3;j<6;j++)
        {
         char b=S.charAt(j);
        System.out.print(b);
        }
        System.out.print("-");
        for(int k=6;k<10;k++)
        {
            char c=S.charAt(k);
        System.out.print(c);
        }
    }
}
