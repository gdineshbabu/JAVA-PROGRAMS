import java.util.*;
public class Transport{
  public static int rentalCarCost(int d) {
     //write your logic here
     int rentalCarCost;
     switch(d)
     {
         case 1:
             rentalCarCost=40*d;
             return rentalCarCost;
        case 2:
             rentalCarCost=40*d;
             return rentalCarCost;
        case 3:
             rentalCarCost=40*d-20;
             return rentalCarCost;
        case 4:
             rentalCarCost=40*d-20;
             return rentalCarCost;
        case 5:
             rentalCarCost=40*d-20;
             return rentalCarCost;
        case 6:
             rentalCarCost=40*d-20;
             return rentalCarCost;
        case 7:
             rentalCarCost=40*d-50;
             return rentalCarCost;
        default:
             rentalCarCost=40*d-50;
             return rentalCarCost;
     }
     
  }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(rentalCarCost(a));
}}
