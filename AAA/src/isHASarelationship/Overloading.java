package isHASarelationship;
public class Overloading {
public static void main(String[] args) {
	Test t1 =new Test();//can call only test member 
	t1.m1();
	t1.m1(77);
	t1.m1("dhoni");
	t1.m1(55.5);
	System.out.println();
		
	Child1 t2 =new Child1();//can call both child and parent 
	t2.m1();
	t2.m1(77);
	t2.m1("dhoni");
	t2.m1(55.5);
	System.out.println();
	
	Test t =new Child1();//can call parent only but through inheritance the method are overridden
	t.m1();//based on new child object at runtime override methods are executing 
	t.m1(77);
	t.m1("dhoni");
	t.m1(55.5);//this double method not overridden so its calling from parrent 
	//whole scenema called compile time polymorphisam  happening by reference not by runtime new object
}}
class Test{
	//method overloading
	public void m1(){System.out.println("am a parent method");} 
	public void m1(String name){System.out.println(name);}
	public void m1(int i){System.out.println(i);}
	
	public void m1(double d){System.out.println(7.5);}
}
class Child1 extends Test{
	//method overriding 
	public void m1(){System.out.println("am a child method");}
	public void m1(String name){System.out.println("mahi");}
	public void m1(int i){System.out.println(7);}
	public void m1(float f){System.out.println(88.5);}}