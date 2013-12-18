import java.util.ArrayList;

public class MmsMessage
{
	private String from;
	private String to;
	private String transactionId;
	private long date;
	private String subject;
	private String contentType;
	private String type;
	
	private ArrayList<MmsPart> parts;
	
	public MmsMessage()
	{
		this.parts = new ArrayList<MmsPart>();
	}
	
	public void setFrom(String from)
	{
		this.from = from + "/TYPE=PLMN";
	}
	
	public void setTo(String to)
	{
		this.to = to + "/TYPE=PLMN";
	}
	
	public void setTransactionId(String transactionId)
	{
		this.transactionId = transactionId;
	}
	
	public void setDate(long date)
	{
		this.date = date;
	}
	
	public void setSubject(String subject)
	{
		this.subject = subject;
	}
	
	public void setContentType(String contentType)
	{
		this.contentType = contentType;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void addPart(MmsPart part)
	{
		this.parts.add(part);
	}

	public long getDate()
	{
		return date;
	}

	public ArrayList<MmsPart> getParts()
	{
		return parts;
	}

	public String getFrom()
	{
		return from;
	}

	public String getTo()
	{
		return to;
	}

	public String getTransactionId()
	{
		return transactionId;
	}

	public String getSubject()
	{
		return subject;
	}

	public String getContentType()
	{
		return contentType;
	}

	public String getType()
	{
		return type;
	}
}
