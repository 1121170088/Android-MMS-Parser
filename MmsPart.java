public class MmsPart
{
	private byte[] content;
	private String contentType;
	
	public MmsPart()
	{	
	}
	
	public void setContent(byte[] content)
	{
		this.content = content;
	}
	
	public void setContentType(String contentType)
	{
		this.contentType = contentType;
	}

	public byte[] getContent()
	{
		return content;
	}

	public String getContentType()
	{
		return contentType;
	}
}
