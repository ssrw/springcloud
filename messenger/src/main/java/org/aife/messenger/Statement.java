package org.aife.messenger;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

public class Statement {
	

	private Long id;
	private String words;
	
	public Statement() {
		super();
		this.id = id;
		this.words = words;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	
	

}
