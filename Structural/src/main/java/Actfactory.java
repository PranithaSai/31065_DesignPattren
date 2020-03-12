
public class Actfactory {
	public  Branch c;
	public  Branch e;
	public  Branch m;
	public  Branch r;

	Actfactory()
	{
		c=new Cse();
		e=new Ece();
		m=new Mechanical();
		r=new Civils();
	}
	public void csecount()
	{
		c.count();
		
	}
	public void ececount()
	{
		e.count();
	}
	public void meccount()
	{
		m.count();
		
	}
	public void civilcount()
	{
		r.count();
		
	}


}
