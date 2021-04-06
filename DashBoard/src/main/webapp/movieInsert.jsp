<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function() {
		$("#fileInput").on('change', function() {
			if(window.FileReader) {
				var fileName = $(this)[0].files[0].name;
			} else {
				var fileName = $(this).val().split('/').pop().split('\\').pop();
			}
			$("#posterFile").val(fileName);
		});
	});

</script>
</head>
<body>
	<section>
		<div class="container-fluid">
			<div class="row mb-5">
				<div class="col-xl-10 col-lg-9 col-md-8 ml-auto">
					<div>
						<button type="button" class="btn btn-info btn-sm" onclick="acyncMovePage('manage_movie.jsp')">뒤로가기</button>
						
						<section>
							<div class="col-12 justify-content-center">
								<h3 class="text-muted text-center mb-3">영화 등록</h3>
							</div>
							<div class="container-fluid">
								<div class="row">
									<div class="col-xl-10 col-lg-9 col-md-8 ml-auto">
										<div class="row pt-md-5 mt-md-3 mb-5">

											<div class="col-xl-3 col-sm-6 p-2">
												<div class="card card-common">
													<div class="card-body">
														<div class="d-flex">
															<div class="text-left text-secondary">
																<div>
																	<label for="title">제목</label>
																	<input type="text" class="form-control" id="title">
																</div><br>
																<div>
																	<label for="age">연령 제한</label> 
																	<select class="form-control" id="age">
																		<option selected value="1">전체 관람가</option>
																		<option value="2">12세 이상 관람가</option>
																		<option value="3">15세 이상 관람가</option>
																		<option value="4">19세 이상 관람가</option>
																	</select>
																</div><br>
																<div class="form-group">
																		<label for="exampleFormControlTextarea2">줄거리</label>
																		<textarea class="form-control rounded-0" id="exampleFormControlTextarea2" rows="3"></textarea>
																</div><br>
																<div>
																	<label for="director">감독</label> 
																	<select class="form-control" id="director">
																		<option selected value="1">스티븐 스필버그</option>
																		<option value="2">봉준호</option>
																		<option value="3">정이삭</option>
																		<option value="4">이준익</option>
																	</select>
																</div><br>
																<div>
																	<label for="actor">배우</label> 
																	<select class="form-control" id="actor">
																		<option selected value="1">송강호</option>
																		<option value="2">윤여정</option>
																		<option value="3">최우식</option>
																		<option value="4">설경구</option>
																	</select>
																</div><br>
															</div>
														</div>
														
													</div>
													
												</div>
											</div>
											<div class="col-xl-3 col-sm-6 p-2">
												<div class="card card-common">
													<div class="card-body">
														<div class="d-flex">
															<div class="text-left text-secondary">
																<div>
																	<label for="genre">장르</label>
																	<input type="text" class="form-control" id="genre">
																</div><br>
																<div>
																	<label for="country">국가</label> 
																	<select class="form-control" id="country">
																		<option selected value="1">한국</option>
																		<option value="2">미국</option>
																		<option value="3">영국</option>
																		<option value="4">일본</option>
																	</select>
																</div><br>
																<div>  
																	<label for="year">개봉연도</label> 
																	<select class="form-control" id="year">
																		<option selected value="1">2017년</option>
																		<option value="2">2018년</option>
																		<option value="3">2019년</option>
																		<option value="4">2020년</option>
																		<option value="5">2021년</option>
																	</select>
																</div><br>
																<div class="form-group">
																	<label for="poster">포스터</label>
																	<input id="fileInput" filestyle="" type="file" data-class-button="btn btn-default" data-class-input="form-control" data-button-text="" data-icon-name="fa fa-upload" class="form-control" tabindex="-1" style="position: absolute; clip: rect(0px 0px 0px 0px);">
																	<div class="bootstrap-filestyle input-group">
																		<input type="text" id="posterFile" class="form-control" name="posterFile" disabled="disabled">
																		<span class="group-span-filestyle input-group-btn" tabindex="0">
																			<label for="fileInput" class="btn btn-default">
																				<span class="glyphicon fa fa-upload"></span>
																			</label>
																		</span>
																	</div>
																</div>
																<div class="form-group">
																	<label for="teaser">티져 영상</label>
																	<input id="fileInput" filestyle="" type="file" data-class-button="btn btn-default" data-class-input="form-control" data-button-text="" data-icon-name="fa fa-upload" class="form-control" tabindex="-1" style="position: absolute; clip: rect(0px 0px 0px 0px);">
																	<div class="bootstrap-filestyle input-group">
																		<input type="text" id="teaserFile" class="form-control" name="teaserFile" disabled="disabled">
																		<span class="group-span-filestyle input-group-btn" tabindex="0">
																			<label for="fileInput" class="btn btn-default">
																				<span class="glyphicon fa fa-upload"></span>
																			</label>
																		</span>
																	</div>
																</div>
																<div class="form-group">
																	<label for="video">본 영상</label>
																	<input id="fileInput" filestyle="" type="file" data-class-button="btn btn-default" data-class-input="form-control" data-button-text="" data-icon-name="fa fa-upload" class="form-control" tabindex="-1" style="position: absolute; clip: rect(0px 0px 0px 0px);">
																	<div class="bootstrap-filestyle input-group">
																		<input type="text" id="videoFile" class="form-control" name="videoFile" disabled="disabled">
																		<span class="group-span-filestyle input-group-btn" tabindex="0">
																			<label for="fileInput" class="btn btn-default">
																				<span class="glyphicon fa fa-upload"></span>
																			</label>
																		</span>
																	</div>
																</div>
																
															</div>
														</div>
														
													</div>
													
												</div>
											</div>
											<div class="col-xl-3 col-sm-6 p-2">
												<div class="card card-common">
													<div class="card-body">
														<div class="d-flex">
															<div class="text-left text-secondary">
																<div>
																	<label for="movieTime">상영 시간</label>
																	<input type="text" class="form-control" id="movieTime">
																</div><br>
																<div>
																	<label for="isActive">연령 제한</label> 
																	<select class="form-control" id="isActive">
																		<option selected value="1">비활성화</option>
																		<option value="2">활성화</option>											
																	</select>
																</div><br>
																<div>
																	<label for="isMain">연령 제한</label> 
																	<select class="form-control" id="isMain">
																		<option selected value="1">NO</option>
																		<option value="2">YES</option>											
																	</select>
																</div><br>
																<div>
																	<label for="subtitle">소제목</label>
																	<input type="text" class="form-control" id="subtitle">
																</div><br>
																<div>
																	<button type="button" class="btn btn-info btn-sm" onclick="acyncMovePage('manage_movie.jsp')">등록하기</button>
																	<button type="button" class="btn btn-info btn-sm" onclick="acyncMovePage('manage_movie.jsp')">뒤로가기</button>
																</div>
															</div>
														</div>
														
													</div>
													
												</div>
											</div>
											
										</div>
									</div>
								</div>
							</div>
						</section>
					</div>

				</div>
			</div>
		</div>
	</section>

</body>
</html>