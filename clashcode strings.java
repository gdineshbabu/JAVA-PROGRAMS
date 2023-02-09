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
        String o = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        if(o.equals("Scissors"))
        {
            System.out.println("Stone");
        }
        else if(o.equals("Stone"))
    {
    System.out.println("Hand");
    }
    else
    {
        if(o.equals("Hand"))
        {
            System.out.println("Scissors");
        }
        else
        {
            System.out.println("Error");
        }
    }
}
}
        
