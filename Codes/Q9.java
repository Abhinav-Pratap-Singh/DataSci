import java.util.*;
class Q9
{
    public void area(double a)
    {
        double area=3.14d*a*a;
        System.out.println("Area of circle with radius "+a+" is "+area);
    }
    public void area(float a)
    {
        double area=a*a;
        System.out.println("Area of Sqaure with side "+a+" is "+area);
    }
    public void area(float a,float b)
    {
        double area=a*b;
        System.out.println("Area of rectangle is "+area);
    }
    public void area(float a,float b,float c)
    {
        double s =(a+b+c)/2;
        s = s*(s-a)*(s-b)*(s-c);
        System.out.println("Area of the triangle is " + Math.sqrt(s));
    }
    public static void main(String args[])
    {
        Q9 obj=new Q9();
        Scanner sc=new Scanner(System.in);
        System.out.println("          Menu        ");
        System.out.println("1.Circle");
        System.out.println("2.Square ");
        System.out.println("3.Rectangle");
        System.out.println("4.Triangle");        
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter radius of Circle ");
            double p=sc.nextDouble();
            obj.area(p);
            break;
            case 2:
            System.out.println("Enter side of Square in float");
            float q =sc.nextFloat();
            obj.area(q);
            break;
            case 3:
            System.out.println("Enter sides of Rectangle in float");
            float r=sc.nextFloat();
            float s=sc.nextFloat();
            obj.area(r,s);
            break;
            case 4:
            System.out.println("Enter sides of triangle");
            float t=sc.nextFloat();
            float u=sc.nextFloat();
            float v=sc.nextFloat();
            obj.area(t,u,v);
            break;
            default:
            System.out.println(" Invalid Input ");
        }
    }
}