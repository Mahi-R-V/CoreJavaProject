package languageFundamental;

public class VariableTypes {
int x=50;
public void sum(){System.out.println(x);}
public static void main(String[] args) {//static area
		
// System.out.println(x); can't call non static in static area
VariableTypes type=new VariableTypes();
System.out.println(type.x);//by using reference variable we can call in static area
type.sum();	//non static area we can call 
		
System.out.println(Mahi.y);	//calling from another class static by using class name 

Test t=new Test();
t.v=11;
t.b=33;
System.out.println(t.v+" "+t.b);//11,33
Test t1=new Test();
System.out.println(t1.v+" "+t1.b);//5,33
Test.sum(10,40,88);
Test.sum(10,40,88,66);
Test.sum(10,40,88,55,88,99);
}}
class Mahi{
	static int y=55;
}
class Test{
	int v=5;//based on objects each copy shared 
	static int b=22;//one copy shared to all	
//ver arg method 
public static void sum(int...x){
	int local=0;
	for (int x1:x){local=local+x1;}
	System.out.println(local);
}
}