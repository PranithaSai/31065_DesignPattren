
public class Actual implements File{
	

	private String doc;
	Actual(String doc)
	{
		this.doc=doc;
	}
	public void share()
	{
		System.out.println("Sharing of file "+doc);
		loading(doc);
	}
	public void loading(String r)
	{
		System.out.println("loading the file to be shared "+r);
		
	}

}
