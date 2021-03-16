package lee.spring.board.dao;

import lee.spring.board.vo.ArticleVO;

// ArticleDAO 인터페이스 구현한 OracleArticleDAO 클래스
public class OracleArticleDAO implements ArticleDAO {

	@Override
	public void insert(ArticleVO article) {
		System.out.println("---> MyOracleArticleDAO.insert() 실행");
	}

	@Override
	public void updateReadCount(int id) {
		System.out.println("---> MyOracleArticleDAO.updateReadCount() 실행");
	}
}
