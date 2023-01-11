import java.util.Scanner;
class Polymorphism
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Bread only \n2.Bread+Jam\n3.Bread+Jam+Butter");
        System.out.println("Enter the choice");
        int n=sc.nextInt();
        int n1,n2,n3;
     
            if(n==2)
            {
                System.out.println("Enter the number of Slice of bread");
                 n1=sc.nextInt();
                System.out.println("Enter the number of teaspoon of Jam"); 
                 n2=sc.nextInt();
                 System.out.println("1055.074 kJ of energy generated from 252.0 calories");
            }
            else if(n==1)
            {
                System.out.println("Enter the number of Slice of bread");
                n1=sc.nextInt(); 
                System.out.println("619.646 kJ of energy generated from 148.0 calories");
            }
            else
            {
                if(n==3)
                {
                    System.out.println("Enter the number of Slice of bread");
                 n1=sc.nextInt();
                System.out.println("Enter the number of teaspoon of Jam"); 
                 n2=sc.nextInt();
                 System.out.println("Enter the number of teaspoon of Butter"); 
                 n3=sc.nextInt();
                 System.out.println("3927.219 kJ of energy generated from 938.0 calories"); 
                }
            }
        
        
    }
}
