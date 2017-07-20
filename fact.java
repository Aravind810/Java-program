package factorial;

import java.util.*;
public class fact {
	public static void main(String[] args) {
		int n,i;
		char f;
System.out.println("Enter the factorial num to find");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n<0)
{
	System.out.println("The factorial is not possible");
}
if(n==0) {
	System.out.println("The factorial is 0");
}
if(n==1)
{
	System.out.println("The Factorial is 1");
}
else 
{
	for(i=n-1;i>=1;i--)
	{
		n=n*i;
	} }
	System.out.println("The Factorial is"+n);
    System.out.println("Do You Want To Continue(Y/N)");
	f=sc.next().charAt(0);
	while(f=='Y')
	{
		System.out.println("Enter the factorial num to find");
		n=sc.nextInt();
		if(n==0)
		{
			System.out.println("The Factorial is 1");
		}
		if(n==1)
		{
			System.out.println("The Factorial is 1");
		}
			for(i=n-1;i>=1;i--)
			{
				n=n*i;
			}
			System.out.println("The Factorial is"+n);
			System.out.println("Do You Want To Continue(Y/N)");
			f=sc.next().charAt(0);
		
	}
	if(f=='N')
	{
		System.out.println("The end");
	}
	
	}
	
}