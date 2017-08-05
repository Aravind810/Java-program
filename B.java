
public class B extends Thread {
	public void run()
	{
		int c;
		c=A.a+A.b;
		System.out.println("Result is"+c);
		
	}
	public static void main(String[] args) throws InterruptedException {
		A a=new A();
		B b=new B();
		a.start();
	a.join();
	b.start();
	}
		
	}
