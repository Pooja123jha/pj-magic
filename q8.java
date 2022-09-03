import java.util.Scanner;
class Cls
{
public static void main(String[] args)
{
float a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three sides");
a=sc.nextFloat();
b=sc.nextFloat();
c=sc.nextFloat();
if(a+b>c && b+c>a && c+a>b)
System.out.println("Triangle can be formed");
else
System.out.println("Triangle cannot be formed");
}
}
