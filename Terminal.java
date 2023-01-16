import java.util.*;
public class Terminal {
    public static int move(int position, int roll) {
        //write your logic here
        int move=position+2*roll;
        return move;
    }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(move(a,b));
}}
