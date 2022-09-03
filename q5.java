import java.util.Scanner;
class Cls
{
public static void main(String[] args)
{
int y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year");
y=sc.nextInt();
if(y%400==0 ||(y%4==0 && y%100!=0))
System.out.println("leap year");
else 
System.out.println("non leap year");
}
}
