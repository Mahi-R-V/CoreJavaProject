package waysofcreatingobjects;

public class singletonclass {

	public static void main(String[] args) {
		
		Test t1=Test.getTest();
		Test t2=Test.getTest();

}
}

class Test {//needs private static variable & private constructor & public static method 
	
	private static Test t=new Test();
	
	private Test(){}
	
	public static Test getTest(){return t;}
	
}