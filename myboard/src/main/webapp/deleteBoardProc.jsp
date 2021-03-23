<%@page import="lee.spring.web.board.Impl.BoardDAO"%>
<%@page import="lee.spring.web.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 1. 사용자 입력 정보 추출
	String seq = request.getParameter("seq");
	// 2. 데이터베이스 연동 처리
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.deleteBoard(vo);
	// 3. 화면 네비게이션
	response.sendRedirect("getBoardList.jsp");
%>