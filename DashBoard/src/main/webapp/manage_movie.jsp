<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
	<div class="container-fluid">
		<div class="row mb-5">
			<div class="col-xl-10 col-lg-9 col-md-8 ml-auto">
				<div class="row">
					<div class="col-12">
						<h3 class="text-muted text-center mb-3">영화 리스트</h3>
					</div>
					<div>
						<table class="table bg-light text-center">
							<thead>
								<tr class="text-muted">
									<th>#</th>
									<th>썸네일</th>
									<th>제목</th>
									<th>장르1</th>
									<th>장르2</th>
									<th>상영시간</th>
									<th>개봉일</th>
									<th>관리</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<th>1</th>
									<th>thumbnail1</th>
									<th>그랜드 부다페스트 호텔</th>
									<th>드라마</th>
									<th>코미디</th>
									<th>60분</th>
									<th>2021-04-01</th>
									<th>
										<button type="button" class="btn btn-info btn-sm">수정</button>
										<button type="button" class="btn btn-info btn-sm">삭제</button>
										<button type="button" class="btn btn-info btn-sm">상세보기</button>
									</th>
								</tr>
								<tr>
									<th>2</th>
									<th>thumbnail2</th>
									<th>클래식</th>
									<th>드라마</th>
									<th>로맨스</th>
									<th>80분</th>
									<th>2021-03-31</th>
									<th>
										<button type="button" class="btn btn-info btn-sm">수정</button>
										<button type="button" class="btn btn-info btn-sm">삭제</button>
										<button type="button" class="btn btn-info btn-sm">상세보기</button>
									</th>
								</tr>
							</tbody>
						</table>
						
						<!-- page -->
						<nav>
							<ul class="pagination justify-content-center">
								<li class="page-item">
									<a href="#" class="page-link py-2 px-3">
										<span>&laquo;</span>
									</a>
								</li>
								
								<!-- 페이지 정보 추가 -->
								<li class="page-item active">
									<a href="#" class="page-link py-2 px-3">1</a>
								</li>
								<li class="page-item">
									<a href="#" class="page-link py-2 px-3">2</a>
								</li>
								<li class="page-item">
									<a href="#" class="page-link py-2 px-3">3</a>
								</li>
								
								<li class="page-item">
									<a href="#" class="page-link py-2 px-3">
										<span>&raquo;</span>
									</a>
								</li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
</body>
</html>