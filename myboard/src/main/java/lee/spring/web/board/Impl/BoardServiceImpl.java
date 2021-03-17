package lee.spring.web.board.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lee.spring.web.board.BoardService;
import lee.spring.web.board.BoardVO;
import lee.spring.web.common.Log4jAdvice;
import lee.spring.web.common.LogAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private boardDAOSpring boardDAO;
	//private LogAdvice log;
	//private Log4jAdvice logging;
	
	public BoardServiceImpl() {
		//logging = new Log4jAdvice();
	}
	
	@Override
	public void insertBoard(BoardVO vo) {
		//logging.printLogging();
		//if(vo.getSeq() == 0) { // 오류 발생 코드
		//	throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
		//}
		boardDAO.insertBoard(vo);
		//boardDAO.insertBoard(vo); // 트랜잭션 오류 처리 테스트 
	}

	@Override
	public void updateBoard(BoardVO vo) {
		//logging.printLogging();
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		//logging.printLogging();
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoardVO(BoardVO vo) {
		//logging.printLogging();
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		//logging.printLogging();
		return boardDAO.getBoardList(vo);
	}

}
