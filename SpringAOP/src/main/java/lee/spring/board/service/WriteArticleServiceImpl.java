package lee.spring.board.service;

import lee.spring.board.dao.ArticleDAO;
import lee.spring.board.vo.ArticleVO;

// WriteArticleService 인터페이스를 구현한 WriteArticleServiceImpl 클래스
public class WriteArticleServiceImpl implements WriteArticleService {
	private ArticleDAO articleDao;
	
	// context Bean 등록을 위해 default 생성자 반드시 필요 
	public WriteArticleServiceImpl() {}
	
	public WriteArticleServiceImpl(ArticleDAO articleDao) {
		this.articleDao = articleDao;
	}
	
	@Override
	public void write(ArticleVO article) {
		System.out.println("---> WriteArticleServiceImpl() 메서드 실행");
		articleDao.insert(article);
	}
}
