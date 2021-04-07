<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="dashboard.css" rel="stylesheet" type="text/css">
<!-- fontawesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.3/css/all.css" integrity="sha384-SZXxX4whJ79/gErwcOYf+zWLeJdY/qpuqC4cAa9rOGUstPomtqpuNWT9wdPEn2fk" crossorigin="anonymous">

<!-- google font -->
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">

<title>NowFlix DashBoard</title>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="script.js"></script>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

</head>
  
<body>
<!-- index.html : navbar -->
<nav class="navbar navbar-expand-md navbar-light"> 
		<button class="navbar-toggler ml-auto mb-2 bg-light" type="button" data-toggle="collapse" data-target="#sidebar">
			<span class="navbar-toggle-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="sidebar">
			<div class="container-fluid">
				<div class="row">
				
					<!-- sidebar -->
					<div class="col-xl-2 col-lg-3 sidebar fixed-top">
						<a href="#" class="navbar-brand text-white text-center d-block mx-auto py-3 mb-4 bottom-border"><img src="images/logo.png" alt="" width="150" onclick="javascript:location.href='manage_template.jsp'"></a>
						<div class="bottom-border pb-3" align="center">
							<img src="images/profile.jpg" alt="" width="50" class="rounded-circle mr-2">
							<a href="#" class="text-white">admin</a>	
						</div>
						<ul class="navbar-nav flex-column mt-4">
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_dashboard.jsp')">
									<i class="fas fa-home text-white fa-lg mr-2"></i>DashBoard
								</a>
							</li>
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_movie.jsp')">
									<i class="fas fa-video text-white fa-lg mr-2"></i>영화
								</a>
							</li>
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_genre.jsp')">
									<i class="fas fa-envelope text-white fa-lg mr-2"></i>장르
								</a>
							</li>
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_director.jsp')">
									<i class="fas fa-shopping-cart text-white fa-lg mr-2"></i>감독
								</a>
							</li>
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_actor.jsp')">
									<i class="fas fa-chart-line text-white fa-lg mr-2"></i>영화배우
								</a>
							</li>
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_member.jsp')">
									<i class="fas fa-user text-white fa-lg mr-2"></i>회원
								</a>
							</li>
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_membership.jsp')">
									<i class="fas fa-credit-card text-white fa-lg mr-2"></i>이용권
								</a>
							</li>
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_sales.jsp')"> 
									<i class="fas fa-money-check-alt text-white fa-lg mr-2"></i>판매
								</a>
							</li>
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_cs.jsp')">
									<i class="fas fa-question-circle text-white fa-lg mr-2"></i>고객센터
								</a>
							</li>
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_policy.jsp')">
									<i class="fas fa-file-signature text-white fa-lg mr-2"></i>이용약관
								</a>
							</li>
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_screen.jsp')">
									<i class="fas fa-tablet-alt text-white fa-lg mr-2"></i>화면
								</a>
							</li>
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_analysis.jsp')">
									<i class="fas fa-chart-line text-white fa-lg mr-2"></i>분석
								</a>
							</li>
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 sidebar-link" onclick="acyncMovePage('manage_manageraccount.jsp')">
									<i class="fas fa-user-cog text-white fa-lg mr-2"></i>관리자
								</a>
							</li>
						</ul>
					</div>
					<!-- end of sidebar -->
					
					<!-- top navbar -->
					<div class="col-xl-10 col-lg-9 ml-auto bg-dark fixed-top py-2 top-navbar">
						<div class="row align-items-center">
							<div class="col-md-4">
								<h4 class="text-light mb-0">&nbsp;Manager DashBoard</h4>
							</div>
							<div class="col-md-5">
								<form action="">
									<div class="input-group">
										<input type="text" class="form-control search-input" placeholder="검색어 입력">
										<button type="button" class="btn btn-light search-button">
											<i class="fas fa-search text-danger"></i>
										</button>
									</div>
								</form>
							</div>
							<div class="col-md-3">
								<ul class="navbar-nav">
									<li class="nav-item icon-parent"><a href="#" class="nav-link icon-bullet"><i class="fas fa-comments text-muted fa-lg"></i></a></li>
									<li class="nav-item icon-parent"><a href="#" class="nav-link icon-bullet"><i class="fas fa-bell text-muted fa-lg"></i></a></li>
									<li class="nav-item ml-md-auto"><a href="#" class="nav-link" data-toggle="modal" data-target="#log-out"><p class="text-white">로그아웃&nbsp;<i class="fas fa-sign-out-alt text-danger fa-lg"></i></p></a></li>
								</ul>
							</div>
						</div>
					</div>
					<!-- modal -->
					<div class="modal fade" id="log-out">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<h4 class="modal-title">관리자 로그아웃</h4>
									<button type="button" class="close" data-dismiss="modal">&times;</button>
								</div>
								<div class="modal-body">
									정말 로그아웃 하시겠습니까?
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-success" data-dismiss="modal">예</button>
									<button type="button" class="btn btn-danger" data-dismiss="modal">아니오</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</nav>
<!-- end of top navbar -->

<div><hr><hr><hr><hr></div>

<div id="bodyContents">
	<section>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xl-10 col-lg-9 col-md-8 ml-auto">
					<div class="row pt-md-5 mt-md-3 mb-5">
					
						<div class="col-xl-3 col-sm-6 p-2">
							<div class="card card-common">
								<div class="card-body">
									<div class="d-flex justify-content-between">
										<i class="fas fa-video fa-3x text-waring"></i>
										<div class="text-left text-secondary">
											<h5>등록된 영화 수</h5>
											<h3>총 90편</h3>
										</div>
									</div>
									
								</div>
								<div class="card-footer text-secondary">
									<a href="#" onclick="acyncMovePage('manage_movie.jsp')"><i class="fas fa-arrow-circle-right mr-3"></i><span>자세히</span></a>
								</div>
							</div>
						</div>
						<div class="col-xl-3 col-sm-6 p-2">
							<div class="card card-common">
								<div class="card-body">
									<div class="d-flex justify-content-between">
										<i class="fas fa-user fa-3x text-waring"></i>
										<div class="text-left text-secondary">
											<h5>가입된 회원 수</h5>
											<h3>총 200명</h3>
										</div>
									</div>
									
								</div>
								<div class="card-footer text-secondary">
									<a href="#" onclick="acyncMovePage('manage_member.jsp')"><i class="fas fa-arrow-circle-right mr-3"></i><span>자세히</span></a>
								</div>
							</div>
						</div>
						<div class="col-xl-3 col-sm-6 p-2">
							<div class="card card-common">
								<div class="card-body">
									<div class="d-flex justify-content-between">
										<i class="fas fa-chalkboard fa-3x text-waring"></i>
										<div class="text-left text-secondary">
											<h5>문의 건수</h5>
											<h3>총 15건</h3>
										</div>
									</div>
									
								</div>
								<div class="card-footer text-secondary">
									<a href="#" onclick="acyncMovePage('manage_cs.jsp')"><i class="fas fa-arrow-circle-right mr-3"></i><span>자세히</span></a>
								</div>
							</div>
						</div>
						<div class="col-xl-3 col-sm-6 p-2">
							<div class="card card-common">
								<div class="card-body">
									<div class="d-flex justify-content-between">
										<i class="fas fa-money-check-alt fa-3x text-waring"></i>
										<div class="text-left text-secondary">
											<h5>월 매출</h5>
											<h3>&#8361;&nbsp;27,195,000</h3>
										</div>
									</div>
									
								</div>
								<div class="card-footer text-secondary">
									<a href="#" onclick="acyncMovePage('manage_sales.jsp')"><i class="fas fa-arrow-circle-right mr-3"></i><span>자세히</span></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section>
		<div class="container-fluid">
			<div class="row mb-5">
				<div class="col-xl-10 col-lg-9 col-md-8 ml-auto">
					<div class="row">
						<div class="col-6">
							<h3 class="text-muted text-center mb-3">신규 가입 회원 리스트</h3>
							<button type="button" class="btn btn-primary btn-sm float-right" onclick="acyncMovePage('manage_member.jsp')">more</button>
							<table class="table bg-light text-center table-bordered table-striped">
								<thead>
									<tr class="text-muted">
										<th>#</th>
										<th>이메일</th>
										<th>닉네임</th>
										<th>가입일</th>			
									</tr>
								</thead>
								<tbody>
									<tr>
										<th>1</th>
										<th>nowflix@gmail.com</th>
										<th>홍길동</th>
										<th>2021-01-03</th>
									</tr>
									<tr>
										<th>2</th>
										<th>exam@naver.com</th>
										<th>둘리</th>
										<th>2020-06-27</th>
									</tr>
									<tr>
										<th>3</th>
										<th>test@hanmail.net</th>
										<th>또치</th>
										<th>2019-08-29</th>
									</tr>
								</tbody>
							</table>
							<!-- page -->
							<nav>
								<ul class="pagination justify-content-center">
									<li class="page-item"><a href="#"
										class="page-link py-2 px-3"> <span>&laquo;</span>
									</a></li>

									<!-- 페이지 정보 추가 -->
									<li class="page-item active"><a href="#"
										class="page-link py-2 px-3">1</a></li>
									<li class="page-item"><a href="#"
										class="page-link py-2 px-3">2</a></li>
									<li class="page-item"><a href="#"
										class="page-link py-2 px-3">3</a></li>

									<li class="page-item"><a href="#"
										class="page-link py-2 px-3"> <span>&raquo;</span>
									</a></li>
								</ul>
							</nav>
						</div>
						<div class="col-6">
							<h3 class="text-muted text-center mb-3">최근 결제 내역</h3>
							<button type="button" class="btn btn-primary btn-sm float-right" onclick="acyncMovePage('manage_sales.jsp')">more</button>
							<table class="table bg-light text-center table-bordered table-striped">
								<thead>
									<tr class="text-muted">
										<th>#</th>
										<th>이메일</th>
										<th>이용권</th>
										<th>결제일</th>			
									</tr>
								</thead>
								<tbody>
									<tr>
										<th>1</th>
										<th>nowflix@gmail.com</th>
										<th>30일권</th>
										<th>2021-01-03</th>
									</tr>
									<tr>
										<th>2</th>
										<th>exam@naver.com</th>
										<th>정기권</th>
										<th>2020-06-27</th>
									</tr>
									<tr>
										<th>3</th>
										<th>test@hanmail.net</th>
										<th>15일권</th>
										<th>2019-08-29</th>
									</tr>
								</tbody>
							</table>
							<!-- page -->
							<nav>
								<ul class="pagination justify-content-center">
									<li class="page-item"><a href="#"
										class="page-link py-2 px-3"> <span>&laquo;</span>
									</a></li>

									<!-- 페이지 정보 추가 -->
									<li class="page-item active"><a href="#"
										class="page-link py-2 px-3">1</a></li>
									<li class="page-item"><a href="#"
										class="page-link py-2 px-3">2</a></li>
									<li class="page-item"><a href="#"
										class="page-link py-2 px-3">3</a></li>

									<li class="page-item"><a href="#"
										class="page-link py-2 px-3"> <span>&raquo;</span>
									</a></li>
								</ul>
							</nav>
						</div>
						
					</div>
				</div>
			</div>
		</div>
	</section>
	<section>
		<div class="container-fluid">
			<div class="row mb-5">
				<div class="col-xl-10 col-lg-9 col-md-8 ml-auto">
					<div class="row">
						<div class="col-12">
							<h3 class="text-muted text-center mb-3">최근 등록된 영화</h3>
							<button type="button" class="btn btn-primary btn-sm float-right" onclick="acyncMovePage('manage_movie.jsp')">more</button>
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
								</tr>
								<tr>
									<th>2</th>
									<th>thumbnail2</th>
									<th>클래식</th>
									<th>드라마</th>
									<th>로맨스</th>
									<th>80분</th>
									<th>2021-03-31</th>								
								</tr>
								<tr>
									<th>3</th>
									<th>thumbnail3</th>
									<th>태극기 휘날리며</th>
									<th>전쟁</th>
									<th>드라마</th>
									<th>120분</th>
									<th>2021-04-05</th>
								</tr>
							</tbody>
						</table>
							<!-- page -->
							<nav>
								<ul class="pagination justify-content-center">
									<li class="page-item"><a href="#"
										class="page-link py-2 px-3"> <span>&laquo;</span>
									</a></li>

									<!-- 페이지 정보 추가 -->
									<li class="page-item active"><a href="#"
										class="page-link py-2 px-3">1</a></li>
									<li class="page-item"><a href="#"
										class="page-link py-2 px-3">2</a></li>
									<li class="page-item"><a href="#"
										class="page-link py-2 px-3">3</a></li>

									<li class="page-item"><a href="#"
										class="page-link py-2 px-3"> <span>&raquo;</span>
									</a></li>
								</ul>
							</nav>
						</div>
				
						
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
</body>
</html>
	