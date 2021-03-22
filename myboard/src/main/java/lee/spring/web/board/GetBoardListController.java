package lee.spring.web.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import lee.spring.web.board.Impl.BoardDAO;

//글 목록 검색 기능 처리 Controller
public class GetBoardListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 목록 검색 처리");
		// 1. 사용자 입력 정보 추출 : 검색 기능은 나중에 구현
		// 2. 데이터베이스 연동 처리
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		// 3. 응답 화면 구성
		HttpSession session = request.getSession();
		session.setAttribute("boardList", boardList);
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", boardList); //Model 정보 전달
		mav.setViewName("getBoardList"); //View 정보 저장
		return mav;
	}
}
