import java.util.*;
public class Reverse{

  public static String solution(String str) {
    //write your logic here
    String solution=new StringBuffer(str).reverse().toString();
    return solution;
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String b=sc.next();
System.out.println(solution(b));
}}
