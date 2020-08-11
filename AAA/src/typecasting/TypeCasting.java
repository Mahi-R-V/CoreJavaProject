package typecasting;

public class TypeCasting {

	public static void main(String[] args){
//should have some relation between objects parent to child /child to parent or same type 
//StringBuffer s2=(string)o;not works type casting type should be same or drived
		 Object o=new String("mahi");
		 Object cv=(String)o;//works
		 
		 String sw=new String("yiu");
		 Object g=(Object)sw;//works become Object g=new String(yiu);
		 
		 Integer i=new Integer(10);
		 Number n=(Number)i;//works
		 Object oo=(Object)i;//works
		 
		Object s1=new String ("mahi");
		StringBuffer s2=(StringBuffer)o;//not works*/
		
		//StringBuffer s2=(string)o;//not works
		
//key- new object ,type casting type, receiving reference object should have relationship 		
//not creating new object just giving another refference	
	}

}
