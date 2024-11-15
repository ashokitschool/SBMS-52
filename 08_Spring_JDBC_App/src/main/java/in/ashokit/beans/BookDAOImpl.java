package in.ashokit.beans;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import in.ashokit.dto.BookDTO;
import in.ashokit.mapper.BookRowMapper;

public class BookDAOImpl implements BookDAO {

	private JdbcTemplate jdbcTemplate;

	public BookDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void saveBook(Integer bid, String bname, Double bprice) {

		String sql = "insert into book_tbl values(?,?,?)";

		jdbcTemplate.update(sql, ps -> {
			ps.setInt(1, bid);
			ps.setString(2, bname);
			ps.setDouble(3, bprice);
		});
	}

	@Override
	public List<BookDTO> getBooks() {

		String sql = "select * from book_tbl";

		List<BookDTO> books = jdbcTemplate.query(sql, new BookRowMapper());

		return books;
	}

}
