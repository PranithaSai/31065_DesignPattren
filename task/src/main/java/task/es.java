package task;

public class es implements Stat{

		public void action( State a) 
		{
	      System . out.println("End state ");
	      a.setState(this);	
	    }

	   public String toString(){
	      return " in the End State";
	   }

public void action(Object a)
{
	
}
}
