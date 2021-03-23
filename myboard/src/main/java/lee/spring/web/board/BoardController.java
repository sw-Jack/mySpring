 package lee.spring.web.board;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import lee.spring.web.board.Impl.BoardDAO;

//Controller들을 하나의 클래스로 묶어서 처리
@Controller
@SessionAttributes("board") //@SessionAttributes 를 사용하면 명시적으로 넘겨지는 값 이외의 값까지, 모든 값들이 유지됨
public class BoardController {
	
	//@Controller가 @RequestMapping 보다 @ModelAttribute에 먼저 접근
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
			// 검색 조건을 아래의 Map 추가하면 됨
			Map<String, String> conditionMap = new HashMap<String, String>();
			conditionMap.put("제목", "TITLE");
			conditionMap.put("내용", "CONTENT");
			return conditionMap;
	}
	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 삭제 처리");
		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("글 상세 보기 처리");
		model.addAttribute("board", boardDAO.getBoard(vo));
		return "getBoard.jsp";
	}
	
	@RequestMapping(value = "/getBoardList.do")
	public String getBoardList(
			//@RequestParam(value = "searchCondition", defaultValue = "TITLE", required = false) String condition,
			//@RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword,
			BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("글 목록 검색 처리");
		System.out.println("검색 조건 : " + vo.getSearchCondition());
		System.out.println("검색 단어 : " + vo.getSearchKeyword());
		model.addAttribute("boardList", boardDAO.getBoardList(vo)); //Model 정보 전달
		return "getBoardList.jsp";
		
	}
	
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 등록 처리");
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(
			@ModelAttribute("board") BoardVO vo, //"board" 이름을 가진 객체의 모든 저장 값들이 유지됨
			BoardDAO boardDAO) {
		System.out.println("글 수정 처리");
		System.out.println("번호 : " + vo.getSeq());
		System.out.println("제목 : " + vo.getTitle());
		System.out.println("작성자 : " + vo.getWriter());
		System.out.println("내용 : " + vo.getContent());
		System.out.println("등록일 : " + vo.getRegDate());
		System.out.println("조회수 : " + vo.getCnt());
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}
}
