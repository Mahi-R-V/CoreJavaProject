package languageFundamental;
public class Arrays {
	
public static void main(String[] args) {
	
//array default value 
int []w=new int [2]; 
System.out.println(w);/*to string internally called */
System.out.println(w[0]);//0 is the answer 

//giving values 
int []y=new int[2]; 
y[0]=15;y[1]=12; 
System.out.println(y[0]);//15 is the answer 

//direct value one dimensional 
int []z={1,2,3}; 
//direct value two dimensional 
int[][]k={{1,2},{4,5}};
//direct value three dimensional 
int[][][] m={{{ 1,2},{3,2} } , { {5,2},{2,5}}};

//length vs length()
String []i={"a","aa","aaa"};
System.out.println(i.length);//base size
System.out.println(i[2].length());//string counts 

//Anonymous array
sum(new int[]{10,20,30,50,});//one time usage 
}
public static void sum(int []x){
	int total=0;
	for(int x1:x)
	{total=total+x1;}
System.out.println("sum:"+total);
	
}
}
