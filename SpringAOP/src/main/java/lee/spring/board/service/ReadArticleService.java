package lee.spring.board.service;

import lee.spring.board.vo.ArticleNotFoundException;
import lee.spring.board.vo.ArticleVO;

//Read 서비스를 제공할 인터페이스
public interface ReadArticleService {
	ArticleVO getArticleAndIncreaseReadCount(int id) throws ArticleNotFoundException;
}
