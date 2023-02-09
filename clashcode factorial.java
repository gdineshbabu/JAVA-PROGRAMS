import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long fact=1;
        if(N>0)
        {
          for(int i=1;i<=N;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        }
           
        
        else
        {
            System.out.println("No negative integers");
        
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

       
    }
}
