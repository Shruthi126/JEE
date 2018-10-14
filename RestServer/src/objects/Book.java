package objects;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String title;
	private List<Author> authors;
	private BigDecimal price;
	private String imageFileName;
	private String link;
	private Date published;
	
	@Override
	public String toString() {
		return "Author [id=" + id + ", title=" + title + ", authors=" + authors
				+ ", price=" + price + ", imageFileName=" + imageFileName
				+ ", link=" + link + ", published=" + published + "]";
	}
	public Book (){}
	
	public Book(String id, String title, List<Author> authors,
			BigDecimal price, String imageFileName, String link, Date published) {
		super();
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.price = price;
		this.imageFileName = imageFileName;
		this.link = link;
		this.published = published;
	}
	 public Book createBook() {
	        return new Book(id, title, authors, price, imageFileName, link, published);
	    }

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Date getPublished() {
		return published;
	}
	public void setPublished(Date published) {
		this.published = published;
	}

}
