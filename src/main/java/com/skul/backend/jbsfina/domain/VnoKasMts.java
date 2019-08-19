package com.skul.backend.jbsfina.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="VnoKasMts.findAll", query="SELECT j FROM VnoKasMts j")
public class VnoKasMts implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6039484997773284077L;
	@Id
	private String lastnokas;

	public String getLastnokas() {
		return lastnokas;
	}

	public void setLastnokas(String lastnokas) {
		this.lastnokas = lastnokas;
	}
	
	

}
