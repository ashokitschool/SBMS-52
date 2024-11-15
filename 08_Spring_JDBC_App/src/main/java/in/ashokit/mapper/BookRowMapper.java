package in.ashokit.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.ashokit.dto.BookDTO;

public class BookRowMapper implements RowMapper<BookDTO> {

	@Override
	public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

		BookDTO dto = new BookDTO();

		dto.setBookId(rs.getInt(1));
		dto.setBookName(rs.getString(2));
		dto.setBookPrice(rs.getDouble(3));

		return dto;
	}

}
