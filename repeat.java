import java.util.*;
class repeat{
  static String repeatStr(int repeat, String string) {
    //write your logic here
    String repeatStr=string.repeat(repeat);
    return repeatStr;
    
    
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String b=sc.next();
System.out.println(repeatStr(a,b));
}
}
