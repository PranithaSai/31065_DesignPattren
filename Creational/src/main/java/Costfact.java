
public class Costfact {
	
	public Specialize getPhone(String s)
	{
		if (s.equals("redmi3"))
	{
		return new read3();
	}
		else if(s.equals("redmi4"))
				{
			return new read4();
					
				}
		else if(s.equals("redmi5"))
		{
			return new read5();
			
		}
		else
		{
			return(null);
		}
	}

}
