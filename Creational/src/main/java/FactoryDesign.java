import java.util.*;
public class FactoryDesign {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the model phone you want to check");
		String s=sc.next();
		
		Costfact e=new Costfact();
		Specialize w=e.getPhone(s);
		
		w.camera();
		w.storagecapacity();
		
		w.cost();
		sc.close();
	}

}
