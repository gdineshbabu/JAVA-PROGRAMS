import java.util.*;
class Main
{
    public static void main(String args[])
    {
        NavigableSet<Integer> ns=new TreeSet<Integer>();
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        System.out.println(ns);
        NavigableSet rns=ns.descendingSet();
        System.out.println(rns);
    }
}
