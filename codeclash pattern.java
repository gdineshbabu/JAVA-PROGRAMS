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
        int height = in.nextInt();
        int width = in.nextInt();
        String material = in.next();
        for(int i=1;i<=height;i++)
        {
            for(int j=1;j<=width;j++)
            {
                System.out.print(material);
            }
            System.out.println("");
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
    }
}
