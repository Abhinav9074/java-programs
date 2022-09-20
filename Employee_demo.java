import java.util.Scanner;

class Employee_demo
{
public static void main(string args[])
{
String name;
int id;
int age;

Scanner sc=new Scanner(System.in);
System.out.println("Enter Name");
name=sc.nextLine();
System.out.println("Enter ID");
id=sc.nextInt();
System.out.println("Enter Age");
age=sc.nextInt();

Employee e1=new Employee();
e1.SetValues(name,id,age);
e1.Print();
}
} 
class Employee
{
public String emp_name;
public int emp_id;
public int emp_age;

void SetValues(String a,int b,int c)
{
emp_name=a;
emp_id=b;
emp_age=c;
}
void Print()
{
System.out.println("Name"+emp_name);
System.out.println("id"+emp_id);
System.out.println("age"+emp_age);
}
}   