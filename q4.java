import java.util.Scanner;
class Cls
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int f=1;
int n;
System.out.println("enter a number");
n=sc.nextInt();
while(n>0)
{
f=f*n;
n--;
}
System.out.println("Factorial is:"+f);
}
}
