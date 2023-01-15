import java.util.*;
public class Day {

    public static String getDay(int n) {
        //write your logic here
        String getDay=" ";
       switch(n)
       {
           case 1:
                  getDay="Sunday";
                  break;
           case 2:
                  getDay="Monday";
                  break;
           case 3:
                  getDay="Tuesday";
                  break;
           case 4:
                  getDay="Wednesday";
                  break;
            case 5:
                  getDay="Thursday";
                  break;
            case 6:
                  getDay="Friday";
                  break;
            case 7:
                  getDay="Saturday";
                  break;
            default:
                  getDay="Wrong, please enter a number between 1 and 7";
                  break;
                  
       }
       return getDay;
 }
  

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(getDay(a));
}}
