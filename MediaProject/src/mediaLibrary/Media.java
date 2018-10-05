package mediaLibrary;

public class Media 
{
	private String mName, mDesc;
	
	public Media(String mName, String mDesc)
	{
		this.mName = mName;
		this.mDesc = mDesc;
	}
	
	public String getName()
	{
		return this.mName;
	}
	
	public String getDesc()
	{
		return this.mDesc;
	}
	
	public void setName(String name)
	{
		this.mName = name;
	}
	
	public void setDesc(String desc)
	{
		this.mDesc = desc;
	}
}
