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
        
        for (int i = 0; i < N; i++) {
           String  colorParent1 = in.next();
            String colorParent2 = in.next();
        
        if(N/2==0)
        {
            System.out.println(colorParent2);

        }
        else if(N/2!=0)
        {
            System.out.println(colorParent1);
        }
        }

}
}
