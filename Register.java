package login;
import java.util.Scanner;
public class Register {
	 static String a,b,d;
	 static int c,e;
	 static void register() {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("Registration Form");
				System.out.println("Enter First Name");
				a=sc.next();
				System.out.println("Enter Last Name");
				b=sc.next();
				System.out.println("Enter Age");
				c=sc.nextInt();
				System.out.println("Enter Username");
				d=sc.next();
				System.out.println("Enter Password");
				e=sc.nextInt();
				System.out.println("Your Registration is Successful");
	    	 }

}
