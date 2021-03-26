package lee.spring.web.board.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lee.spring.web.board.BoardService;
import lee.spring.web.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAOMybatis boardDAO; //Controller가 직접 DAO에 접근하지 않고, Service Interface를 통해서 접근
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
	public BoardVO getBoard(BoardVO vo) {
		//logging.printLogging();
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		//logging.printLogging();
		return boardDAO.getBoardList(vo);
	}
}
