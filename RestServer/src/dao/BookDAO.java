package dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import objects.Book;

public class BookDAO {

	public Book createBook(Book book) {
		//this method should  have done adb hit ideally
		// for POC we are listing it in 
		
		
		return null;
	}

	public List<Book> getAll() {
		Book book = new Book ("ierl", "asdkg", null, BigDecimal.valueOf(4.6), null, "kdfxh", new Date());
		List booklist=new ArrayList<Book>();
		booklist.add(book);
		return booklist;
	}

}
