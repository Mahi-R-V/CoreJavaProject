package isHASarelationship;

public class IsARelationship {//extends and implement are called is a relationship 

public static void main(String[] args) {
		Parent p=new Parent();
		p.m();
//p.m1(); parent can not have child member 
		Child c=new Child();
		c.m();
		c.m1();
//child can have both members
		Parent p1=new Child();
		p1.m();
//p1.m1(); even though object is child but parent reference can not have child members  
		
//Child c1=new Parent(); child reference can not hold parent object 
}
}
class Parent{
	
public void m(){System.out.println("am a parent ");}
}
class Child extends Parent{
	public void m1(){System.out.println("am a child");}
}