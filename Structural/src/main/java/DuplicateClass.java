
public class DuplicateClass implements File {
	private String doc;
	 private Actual o;
	  
	DuplicateClass(String doc)
	{
		this.doc=doc;
		
	}
	public void share()
	{
		
		
		if(o==null)
		{
			o =new Actual(doc);
		}
		o.share();
	}


}
