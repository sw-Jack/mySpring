<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 1. 브라우저와 연결된 세션 객체를 종료
	session.invalidate();
	// 2. 세션 종료 후 메인 화면으로 이동
	response.sendRedirect("login.jsp");
%>