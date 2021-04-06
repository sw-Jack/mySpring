<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="script.js"></script>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<link href="dashboard.css" rel="stylesheet" type="text/css">

</head>

<body>
	
	
	<section>
	<div class="container-fluid">
		<div class="row mb-5">
			<div class="col-xl-10 col-lg-9 col-md-8 ml-auto">
				<div>
					<div class="col-12">
						<h3 class="text-muted text-center mb-3">영화 리스트</h3>
					</div>
						<div class="col-12">
							<div class="row mb-1">
								<button type="button" class="btn btn-primary btn-sm" onclick="acyncMovePage('movieInsert.jsp')">영화추가</button>
								&nbsp;&nbsp;&nbsp;
								<form action="">
									
									<div class="input-group">
										<div>
											<select class="form-control">
												<option selected value="1">영화</option>
												<option value="2">감독</option>
												<option value="3">장르</option>
											</select>
										</div>
										<input type="text" class="form-control search-input"
											placeholder="검색어 입력">
										<button type="button" class="btn btn-light search-button">
											<i class="fas fa-search text-danger"></i>
										</button>										
									</div>

								</form>
							</div>
						</div>

						<div>
						<table class="table bg-light text-center table-bordered table-striped">
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
										<button type="button" class="btn btn-primary btn-sm" onclick="acyncMovePage('movieModify.jsp')">수정</button>
										<button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#deleteMovie">삭제</button>
										<button type="button" class="btn btn-primary btn-sm">상세보기</button>
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
										<button type="button" class="btn btn-primary btn-sm" onclick="acyncMovePage('movieModify.jsp')">수정</button>
										<button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#deleteMovie">삭제</button>
										<button type="button" class="btn btn-primary btn-sm">상세보기</button>
									</th>
								</tr>
								<tr>
									<th>3</th>
									<th>thumbnail3</th>
									<th>태극기 휘날리며</th>
									<th>전쟁</th>
									<th>드라마</th>
									<th>120분</th>
									<th>2021-04-05</th>
									<th>
										<button type="button" class="btn btn-primary btn-sm" onclick="acyncMovePage('movieModify.jsp')">수정</button>
										<button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#deleteMovie">삭제</button>
										<button type="button" class="btn btn-primary btn-sm">상세보기</button>
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
					<!-- modal -->
					<div class="modal fade" id="deleteMovie">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<h4 class="modal-title">영화 삭제</h4>
									<button type="button" class="close" data-dismiss="modal">&times;</button>
								</div>
								<div class="modal-body">해당 영화를 정말 삭제하시겠습니까?</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-success"
										data-dismiss="modal">예</button>
									<button type="button" class="btn btn-danger"
										data-dismiss="modal">아니오</button>
								</div>
							</div>
						</div>
					</div>
				</div>
				
				
			</div>
		</div>
	</div>
	</section>
</body>
</html>