package org.shruthi.rest.model;

import java.util.Date;

public class Profile {
	private String name;
	private long Id;
	private Date created;
	private String profileName;
	
	public Profile(){}
	
	public Profile(String name, long id, Date created, String profileName) {
		super();
		this.name = name;
		Id = id;
		this.created = created;
		this.profileName = profileName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	
	

}
