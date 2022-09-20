import java.util.Scanner;
class Fibbonacci
{
public static void main(String args[])
{
int fib1=0,fib2=1,fib3,i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit");
n=sc.nextInt();
System.out.println(fib1);
System.out.println(fib2);
for(i=2;i<=n;i++)
{
fib3=fib1+fib2;
System.out.println(fib3);
fib1=fib2;
fib2=fib3;
}
}
}
