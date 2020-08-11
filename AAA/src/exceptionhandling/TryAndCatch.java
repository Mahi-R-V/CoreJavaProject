package exceptionhandling;

public class TryAndCatch {

	public static void main(String[] args) {
		System.out.println(" am not good");
		try{System.out.println(10/0);}
		catch(ArithmeticException e){System.out.println(10/2);}
		System.out.println("am good");

	}}


