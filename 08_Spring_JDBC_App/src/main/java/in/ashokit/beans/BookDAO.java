package in.ashokit.beans;

import java.util.List;

import in.ashokit.dto.BookDTO;

public interface BookDAO {

	public void saveBook(Integer bid, String bname, Double bprice);

	public List<BookDTO> getBooks();

}
