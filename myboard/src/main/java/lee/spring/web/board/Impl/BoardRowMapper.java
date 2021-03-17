package lee.spring.web.board.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import lee.spring.web.board.BoardVO;

//RowMapper 인터페이스를 구현한 BoardRowMapper 클래스
// -> 검색 결과를 특정 VO 객체에 매핑하여 리턴
public class BoardRowMapper implements RowMapper<BoardVO> {

	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO board = new BoardVO();
		board.setSeq(rs.getInt("seq"));
		board.setTitle(rs.getString("title"));
		board.setWriter(rs.getString("writer"));
		board.setContent(rs.getString("Content"));
		board.setRegDate(rs.getDate("regdate"));
		board.setCnt(rs.getInt("cnt"));
		return board;
	}

}
