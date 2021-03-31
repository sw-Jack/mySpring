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
						<a href="#" class="navbar-brand text-white text-center d-block mx-auto py-3 mb-4 bottom-border"><img src="images/logo.png" alt="" width="150"></a>
						<div class="bottom-border pb-3" align="center">
							<img src="images/profile.jpg" alt="" width="50" class="rounded-circle mr-2">
							<a href="#" class="text-white">admin</a>	
						</div>
						<ul class="navbar-nav flex-column mt-4">
							<li class="nav-item">
								<a href="#" class="nav-link text-white p-2 mb-2 current" onclick="acyncMovePage('manage_dashboard.jsp')">
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
										<input type="text" class="form-control search-input" placeholder="Search">
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

<div id="bodyContents"></div>
 </body>
</html>
	