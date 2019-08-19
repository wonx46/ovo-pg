package com.skul.backend.jbsfina.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="VnoKasSmp.findAll", query="SELECT j FROM VnoKasSmp j")
public class VnoKasSmp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7735016678726029737L;
	
	@Id
	private String lastnokas;

	public String getLastnokas() {
		return lastnokas;
	}

	public void setLastnokas(String lastnokas) {
		this.lastnokas = lastnokas;
	}
	
	

}
