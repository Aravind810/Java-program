package login;
import java.util.Scanner;
public class login extends Register 
{
	static String f;
	static int g;
	 static void login()
     {
    	 Scanner sc=new Scanner(System.in);
        System.out.println("Login Form");
 		System.out.println("Enter Username");
 		f=sc.next();
 		System.out.println("Enter Password");
 		g=sc.nextInt();	
 		 }
static void condition()
{ if(f.equals(d))
{
	 if(e==g)
	 {
		 System.out.println("Login Successful");
		 System.out.println("First Name :"+a);
		 System.out.println("Second Name :"+b);
		 System.out.println("Age :"+c);
	 }
}
else
{
	 System.out.println("Login Failed");
}
}
}