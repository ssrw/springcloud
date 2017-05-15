package Exception;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DataNotFoundExceptionEntity {
	
	private String message;
	private String link;
	
	
	public DataNotFoundExceptionEntity() {
	
	}
	public DataNotFoundExceptionEntity(String message, String link) {
		super();
		this.message = message;
		this.link = link;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	

}
