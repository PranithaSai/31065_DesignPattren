package task;
import java.util.*;
public class Strategy {
	public static void main(String args[])
	{
		Scanner ama=new Scanner(System.in);
	System.out.println("Enter the values of a and b");
	int a1=ama.nextInt();
	int b1=ama.nextInt();

		Getaccess a = new Getaccess(new Add());		
	    a.accessing(a1,b1);
	    Getaccess a3 = new Getaccess(new Modulus());		
	    a3.accessing(a1,b1);
	    Getaccess a4 = new Getaccess(new power());		
	    a4.accessing(a1,b1);
	    ama.close();
		
}

}
