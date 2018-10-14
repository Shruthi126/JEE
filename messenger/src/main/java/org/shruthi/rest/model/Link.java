package org.shruthi.rest.model;

public class Link {
	
	private String rel;
	private String link;
	
	public String getRel() {
		return rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Link(String rel, String link) {
		super();
		this.rel = rel;
		this.link = link;
	}
	
	public Link(){}
}
