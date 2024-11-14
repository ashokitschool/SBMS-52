package in.ashokit.beans;

import org.springframework.jdbc.core.JdbcTemplate;

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
}
