package rough;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Palandroom {

	
@Test
public void palin()
{
	Scanner sc = new Scanner(System.in);
System.out.println("Enter String: ");
//int num=sc.nextInt();
String pala=sc.nextLine();
String rev="";
for(int i=pala.length()-1;i>=0;i--)
{
	rev=rev+pala.charAt(i);
	
}
System.out.println("the rev String is"+rev);

if(pala.equals(rev))
{
	System.out.println("yes");
}
else
{
	System.out.println("No");
}
}
}
