package org.koushik.javabrains.Passenger;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Passage {
	private long passageid;
	public long getPassageid() {
		return passageid;
	}
	public void setPassageid(long passageid) {
		this.passageid = passageid;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	private String article;

}
