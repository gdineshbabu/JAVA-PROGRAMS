import java.util.*;
public class Oddcount {

  public static int oddCount(int n){

    //write your logic here
    int oddCount=0;
   
    for(int i=0;i<n;i++)
    {
        if(i%2==1)
        {
            oddCount++;
        }
    }
    return oddCount;
  }


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(oddCount(a));
}}
