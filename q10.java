import java.util.Scanner;
class Cls
{
public static void main(String[] args)
{
int a,i=0,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
a=sc.nextInt();
for(i=2;i<=Math.sqrt(a);i++)
{ if(a%i==0)
c++;
}
if(c==0)
System.out.println("Number is prime");
else 
System.out.println("Number is not prime");
}
}
