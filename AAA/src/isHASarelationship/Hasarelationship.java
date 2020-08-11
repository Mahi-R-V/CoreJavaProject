package isHASarelationship;

public class Hasarelationship {
	
public void m(Animal a){System.out.println("animal version");}
public void m(Dog d ){System.out.println("dog version ");}

public static void main(String[] args) {
		
	Hasarelationship h=new Hasarelationship();
	
	Animal a=new Animal();//compile time polymorphim concept
	Dog d=new Dog();
	Animal t=new Dog();
	
	h.m(a); //h has another objects 
	h.m(d);
	h.m(t);

}}

class Animal{}
class Dog extends Animal{}
