package book.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class bookProducts { 
	
	@Value("${my.book}")
	private String Book;
	@Value("${my.author}")
	private String author;
	@Value("{price}")
	private int price;
	@Value("{my.aty}")
	private int qty;
	
	@Override
	public String toString() {
		return "bookProducts [Book=" + Book + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
 
}
