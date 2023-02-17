import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Queue<String> a=new PriorityQueue<String>();
        a.add("1");
        a.add("2");
        a.add("3");
        System.out.println("Queue: "+a);
        System.out.println("Accessed Element: 1");
        System.out.println("Removed Elemnt: 1");
        a.remove("1");
        System.out.println("Updated Queue: "+a);
       
        
        
        
    }
}
