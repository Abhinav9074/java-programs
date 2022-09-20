import java.util.Scanner;
import java.lang.Math;
class Armstrong
{
public static void main(String args[])
{
int num,sum,temp,value,n1,n2;
Scanner sc=new Scanner(System.in);
System.out.println("enter the starting range");
n1=sc.nextInt();
System.out.println("enter the ending range");
n2=sc.nextInt();
System.out.println("armstrong number within the given range are");
for(num=n1;num<n2;num++)
{
for(i=0;i<=n2;i++)
{
if(
temp=num;
sum=0;
while(temp!=0)
{
value=temp%10;
temp=temp/10;
sum=sum+(value*value*value);
}
if(sum==num)
{
System.out.println(num);
}
}
}
}


