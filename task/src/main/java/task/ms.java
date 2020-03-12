package task;

public class ms implements Stat
{
	public void action( State a) {
	      System.out.println("Intermediate state ");
	      a.setState(this);	
	   }

	   public String toString(){
	      return "in the Intermediate state";
	   }

	public void action(Object a) {
		
		
}

}
