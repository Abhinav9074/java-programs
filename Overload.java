class OverloadDemo{

void sum(int x,int y){
int sum=x+y;
System.out.println("result"+sum);
}
void sum(int x,int y,int z){
int total=x+y+z;
System.out.println("result"+total);
}
}
class Overload{
public static void main(String args[]){
OverloadDemo c1=new OverloadDemo();
c1.sum(10,20);
c1.sum(10,20,30);
}
}

