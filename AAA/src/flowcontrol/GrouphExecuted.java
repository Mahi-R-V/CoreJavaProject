package flowcontrol;

public class GrouphExecuted {

	public static void main(String[] args) {
	int x=0;
	int y=10;
	while (x>y){System.out.println("hi");}
	System.out.println("hello");
	
	
	do{System.out.println("am bad");}
	while (x>y);
	System.out.println("oh god");
	
	for (System.out.println("i");x<5;System.out.println("u")){x++;}
	for (int i=0;i<10;i++){System.out.println("am good");}
//one dimensional
	int[]a={10,2,50};
	for(int i=0;i<a.length;i++){System.out.println(a[i]);}//normal
	
	for(int a1:a)System.out.println(a1); //for each 
//2 Dimensional 	
	int[][]b={{10,20},{20,50}};
	for(int i=0;i<b.length;i++){for(int j=0;j<b[i].length;j++)
	{System.out.println(b[i][j]);}}
	
	for(int []b1:b){for( int b2:b1){System.out.println(b2);}} //for each
	
//3 Dimensional 
//for(int[][] b1:b){for( int[] b2:b1){for(int b3:b2){System.out.println(b3);}}} //for each 
		
	
}
}
