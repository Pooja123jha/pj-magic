import java.util.Scanner;
class Cls
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
float a,r;
float pi=3.14f;
System.out.println("enter radius");
r=sc.nextFloat();
a=pi*(float)Math.pow(r,2);
System.out.println("Area of circle is"+a);
}
}
