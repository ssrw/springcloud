package org.koushik.javabrains.Passenger;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Player {
	private String playername;
	private String playerId;
	
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	

}

