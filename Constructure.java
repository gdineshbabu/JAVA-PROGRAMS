import java.util.Scanner;
class Constructor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Cube \n2.Sphere \n3.Cylinder");
        System.out.println("Enter the choice");
        int n=sc.nextInt();
        double a;
        if(n==1)
        {
            System.out.println("length");
            int l=sc.nextInt();
            System.out.println("breadth");
            int b=sc.nextInt();
            System.out.println("height");
            int h=sc.nextInt();
            int c=l*b*h;
             System.out.println("Area of Cube is "+c);
        }
        else if(n==2)
        {
            System.out.println("radius");
            int r=sc.nextInt();
            a=((double)4 / 3) * 3.14 * (r * r * r);
            System.out.printf("Area of Sphere is %.2f ",a);
        }
        else
        {
            if(n==3)
            {
                System.out.println("radius");
                int r1=sc.nextInt();
                System.out.println("height");
                int h1=sc.nextInt();
                a=(double)(3.14*r1*r1*h1);
                System.out.printf("Area of Cylinder is %.1f ",a);
            }
        }
    }
}
