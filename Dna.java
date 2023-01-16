import java.util.*;
public class Dna {
    public static String dnaToRna(String dna) 
    {
        //write your logic here
        String dnaToRna=dna.replace("T","U");
        return dnaToRna;
    } 


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String a=sc.next();
System.out.println(dnaToRna(a));
}}
