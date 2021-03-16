package lee.spring.common;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

import lee.spring.board.vo.ArticleVO;

// Around Advice 실습용
// Cache 클래스 활용하여 cache에서 지난 값 가져오기 
public class ArticleCacheAdvice {
	private Map<Integer, ArticleVO> cache = new HashMap<Integer, ArticleVO>();
	
	public ArticleVO cache(ProceedingJoinPoint joinPoint) throws Throwable {
		// JoinPoint 메서드인 getArgs() : 클라이언트가 메서드를 호출할 때 넘겨준 인자 목록을 Object 배열로 리턴
		Integer id = (Integer)joinPoint.getArgs()[0]; // getArgs()[0] : 넘겨준 인자 목록 중 id 값
		ArticleVO article = cache.get(id);
		if(article != null) {
			System.out.println("[ACA] 캐시에서 Article[" + id + "] 구함");
			return article;
		}
		// 처음 캐시를 호출할 때는 캐시(map)에 저장된 값이 없으므로 아래 수행, 이후에 캐시가 만들어지고 나면 그 이후터는 캐시값에 저장된 정보를 불러옴
		ArticleVO ret = (ArticleVO)joinPoint.proceed();
		if(ret != null) {
			cache.put(id, ret);
			System.out.println("[ACA] 캐시에 Article[" + id + "] 추가함");
		}
		return ret;
	}
}
