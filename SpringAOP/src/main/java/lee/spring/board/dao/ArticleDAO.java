package lee.spring.board.dao;

import lee.spring.board.vo.ArticleVO;

// 데이터베이스 처리 ArticleDAO 인터페이스
public interface ArticleDAO {
	void insert(ArticleVO article);
	void updateReadCount(int id);
}
