import java.util.*;
public class Twice {

  public static int TwiceAsOld(int dadYears, int sonYears){
    //write your logic here
    int TwiceAsOld=dadYears-2*sonYears;
    return TwiceAsOld;
    
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int dadYears=sc.nextInt();
int sonYears=sc.nextInt();
System.out.println(TwiceAsOld(dadYears,sonYears));
}}
