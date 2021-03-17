package lee.spring.web.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceAnnotationClient {

	public static void main(String[] args) {

		// 1. 스프링 컨테이너 구동
		AbstractApplicationContext container = 
				//new GenericXmlApplicationContext("applicationContextBoardAnnotation.xml");
				new GenericXmlApplicationContext("applicationContextDB.xml");
		
		// 2. 스프링 컨테이너로부터 BoardServiceImple 객체를 lookup 한다
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		// 3. 글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		//vo.setSeq(1000); // 트랜잭션 오류 처리 테스트 
		vo.setTitle("임시제목");
		vo.setWriter("손");
		vo.setContent("새로운 글1");
		boardService.insertBoard(vo);
		
		// 4. 글 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		// 5. 스프링 컨테이너 종료 
		container.close();
	}
}
