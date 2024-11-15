package in.ashokit.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import in.ashokit.dto.BookDTO;
import in.ashokit.excel.ExcelGenerator;

public class BookService {

	private BookDAO bookDao;

	private ExcelGenerator excelGenerator;

	public BookService(BookDAO bookDao, ExcelGenerator excelGenerator) {
		this.bookDao = bookDao;
		this.excelGenerator = excelGenerator;
	}

	public void getBooks() throws Exception{

		List<BookDTO> books = bookDao.getBooks();
		
		excelGenerator.generateExcel(books);

		books.forEach(book -> {
			System.out.println(book);// toString() method
		});

	}

	public void storeBookData() throws Exception {

		File f = new File("book.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		while (line != null) {

			String[] data = line.split(",");
			Integer bid = Integer.parseInt(data[0]);
			String bname = data[1];
			Double price = Double.parseDouble(data[2]);

			bookDao.saveBook(bid, bname, price);

			// read next line data
			line = br.readLine();
		}

		System.out.println("Books Inserted In DB Table....");

		br.close();
	}

}
