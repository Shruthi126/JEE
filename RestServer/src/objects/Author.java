package objects;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Author implements Serializable{
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBlogURL() {
		return blogURL;
	}
	public void setBlogURL(String blogURL) {
		this.blogURL = blogURL;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String blogURL;
	public Author(String id, String name, String blogURL) {
		super();
		this.id = id;
		this.name = name;
		this.blogURL = blogURL;
	}
	
	public Author (){}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", blogURL=" + blogURL
				+ "]";
	}
	
}
