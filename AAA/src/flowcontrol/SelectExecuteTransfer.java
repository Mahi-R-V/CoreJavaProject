package flowcontrol;

public class SelectExecuteTransfer {

	public static void main(String[] args) {
		int x=5;
		if (x!=5){System.out.println("hi");}
		else System.out.println("hello");
		
		int choise=2;
		switch (choise)
		{case 1:System.out.println("sunday");
		break;
		case 2:System.out.println("monday");
		break;
		case 3:System.out.println("tuesday");
		break;
		case 4:System.out.println("wednesday");
		break;
		case 5:System.out.println("thursday");
		break;
		case 6:System.out.println("friday");
		break;
		case 7:System.out.println("saturday");
		break;
		default:System.out.println("none of the above");
		}
//break ,continue
for(int i=0;i<10;i++){if (i==5) break; System.out.println(i);}
for(int i=0;i<10;i++){if (i%2==0) continue; System.out.println(i);}
}}
