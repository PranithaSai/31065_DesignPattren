import java.util.*;
public class Proxy {
	public static void main(String args[])
	{
		Scanner ama=new Scanner(System.in);
	System.out.println("Enter the doc to be shared");
	String s=ama.next();
		File s1=new DuplicateClass(s);
		s1.share();
		ama.close();
}

}
