package login;
import java.util.Scanner;

public class Log extends login
{

		static String i;
	 	static int n=0;
	 	static String h,j;
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    register();
	    login();
	    condition();
	 System.out.println("Do You Want to Login Again(Y/N)");
	 h=sc.next();
	 do
	 {
	 if(h.equalsIgnoreCase("Y"))
	 {
		 login();
		 condition();
		 System.out.println("Do You Want to Login Again(Y/N)");
		 h=sc.next(); 
	 }
	if(h.equalsIgnoreCase("N"))
	{
		System.out.println("Do you want to Register(Y/N)");
		j=sc.next();
		if(j.equalsIgnoreCase("Y"))
		{
			register();
			login();
			condition();
			System.out.println("Do You Want to Login Again(Y/N)");
			h=sc.next();
		}
		 if(j.equalsIgnoreCase("N"))
		{
			System.out.println("");
			break;
		}
	}
	}while(n<100);
	}
	}
