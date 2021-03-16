package lee.spring.board.service;

import lee.spring.board.vo.ArticleVO;

// 게시판 글쓰기 서비스를 제공할 WriteArticleService 인터페이스
public interface WriteArticleService {
	void write(ArticleVO article);
}
