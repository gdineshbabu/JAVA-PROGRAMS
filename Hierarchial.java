import java.util.Scanner;
class Hierarchial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details of Sports Bike");
        System.out.println("Name of the bike :");
        String n=sc.nextLine();
        System.out.println("Color of the bike :");
        String c=sc.nextLine();
        System.out.println("Capacity(CC) of the bike :");
        float cc=sc.nextFloat();
        System.out.println("Speed of the bike :");
        int s=sc.nextInt();
        System.out.println("Price of the bike :");
        float p=sc.nextFloat();
        System.out.println("Discount of the bike :");
        float d=sc.nextFloat();
        System.out.println("Enter the details of Scooter");
        System.out.println("Name of the Scooter :");
        String na=sc.next();
        System.out.println("Color of the Scooter :");
        String co=sc.next();
        System.out.println("Capacity(CC) of the Scooter :");
        float ccc=sc.nextFloat();
        System.out.println("Speed of the Scooter :");
        int sp=sc.nextInt();
        System.out.println("Price of the Scooter :");
        float pr=sc.nextFloat();
        System.out.println("Discount of the scooter :");
        float di=sc.nextFloat();
        
        System.out.println("Weight of the scooter :");
        int w=sc.nextInt();
        System.out.println("Sports Bike :");
        System.out.println("Name : "+n);
        System.out.println("Color : "+c);
        System.out.printf("Capacity : %.1f",cc);
        System.out.println("\nSpeed : "+s);
        System.out.printf("Price : %.1f",p);
        System.out.printf("\nManufacturer Discount : %.0f",d);
        float a=p-d;
        System.out.printf("\nSports Bike price is %.1f",a);
        System.out.println("\nScooter :");
        System.out.println("Name : "+na);
        System.out.println("Color : "+co);
        System.out.printf("Capacity : %.1f",ccc);
        System.out.println("\nSpeed : "+sp);
        System.out.printf("Price : %.1f",pr);
        System.out.println("\nWeight : "+w);
        System.out.printf("Manufacturer Discount : %.0f",di);
        float ar=pr-di;
        System.out.printf("\nScooter price is %.1f",ar);
       
        
    }
}
