import java.io.Serializable;


public class DataFetch implements Serializable {
	public String clientname;
	public String clientid;
	public DataFetch(String string) {
		// TODO Auto-generated constructor stub
	}
	public DataFetch(String clientname2, String clientid2) {
		this.clientname=clientname2;
		this.clientid=clientid2;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	
	

}
