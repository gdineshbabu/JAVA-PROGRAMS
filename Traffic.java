import java.util.*;
public class Traffic {

     public static String updateLight(String current) {
    //write your logic here
    String updateLight=" ";
    switch(current)
    {
        case "red":
            updateLight="green";
            break;
        case "green":
            updateLight="yellow";
            break;
        case "yellow":
            updateLight="red";
            break;
            
    }
    return updateLight;
    
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String current=sc.nextLine();
System.out.println(updateLight(current));
}}
