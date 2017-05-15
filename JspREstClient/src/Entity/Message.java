package Entity;

public class Message {
	
	private Long id;
	private String name;
	private String insertStatus;
	
	
	public String getInsertStatus() {
		return insertStatus;
	}
	public void setInsertStatus(String insertStatus) {
		this.insertStatus = insertStatus;
	}
	public Message(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Message() {
		// TODO Auto-generated constructor stub
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
