package lee.spring.board.service;

import lee.spring.board.vo.ArticleNotFoundException;
import lee.spring.board.vo.ArticleVO;

// Read 서비스를 구현한 클래스
public class ReadArticleServiceImpl implements ReadArticleService {

	@Override
	public ArticleVO getArticleAndIncreaseReadCount(int id) throws ArticleNotFoundException {
		if(id == 0) throw new ArticleNotFoundException();
		return new ArticleVO();
	}
}
