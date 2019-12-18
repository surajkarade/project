package com.webcorestone.DMS.model;

import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class post 
{	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpText() {
		return pText;
	}
	public void setpText(String pText) {
		this.pText = pText;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	@Id
	private int pId;
	private String pText;
	private Date pdate;
	
	
	
}
