package in.ashokit.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BookService {

	private BookDAO bookDao;

	public BookService(BookDAO bookDao) {
		this.bookDao = bookDao;
	}
	
	public void generateExcel() {
		
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
