import java.util.Scanner;
class Cls
{
public static void main(String[] args)
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Before swap a= "+a+" and b=" +b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swap a= "+a+" and b=" +b);
}
}
