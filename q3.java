import java.util.Scanner;
class Cls
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
float h,r,v;
float pi=3.14f;
System.out.println("enter radius");
r=sc.nextFloat();
System.out.println("enter height");
h=sc.nextFloat();
v=(pi*r*r*h)/3;
System.out.println("Volume of cone is"+v);
}
}
