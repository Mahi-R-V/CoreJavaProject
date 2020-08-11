package abstractconstructor;
public class Abstractconstructor {
public static void main(String[] args) {
	Child c=new Child("mahi",10,5478,"AVS","Raja",101);
	System.out.println(c.age+" "+c.name+" "+c.collegename+" "+c.rollno);

	}}
abstract class Parent{
	String name;
	int age;
	int id;
	String collegename;
	String fathername;
	Parent(String name, int age,int id,String collegename,String fathername){//abstract constructor
	this.name=name;
	this.age=age;
	this.id=id;
	this.collegename=collegename;
	this.fathername=fathername;}
}
class Child extends Parent{
	
int rollno;//adding 101 element

	Child(String name, int age, int id, String collegename, String fathername, int rollno) {
		super(name, age, id, collegename, fathername);
		this.rollno=rollno;}}